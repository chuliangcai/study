package com.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {

    @Override
    public void run() {
        try {
            //1-65535 监听12345端口
            ServerSocket serverSocket = new ServerSocket(12345);
            //监听客户端链接，调用accept()方法 accept方法是一个阻塞的方法，会阻塞当前线程

            //每当有一个客户端连接到当前的serversocket就会返回一个新的socket对象，所以当有多个的时候
            //就要创建一个while循环来监听来自客户端的链接
            while (true) {//true，让他一直处于循环，不会结束
                Socket socket = serverSocket.accept();
                //客户端有请求时，弹出提示框
                JOptionPane.showMessageDialog(null, "有客户链接到了本机的12345端口");
                //由于每个socket又要与独立的客户端进行通讯，所以将socket传递给新的线程
                ChatSocket chatSocket = new ChatSocket(socket);
                chatSocket.start();
                ChatManager.getChatManager().add(chatSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
