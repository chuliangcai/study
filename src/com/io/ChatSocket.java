package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatSocket extends Thread {

    private Socket socket;

    public ChatSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(), "UTF-8"));
            String line;
            //客户端的数据
            while ((line = br.readLine()) != null) {
                //发给聊天室的所有人
                ChatManager.getChatManager().publish(this, line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void out(String out) {
        try {
            // 执行数据的输出和相关功能的包装
            socket.getOutputStream().write(out.getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
