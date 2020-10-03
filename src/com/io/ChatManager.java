package com.io;

import java.util.Vector;

public class ChatManager {

    private ChatManager() {}

    private static final ChatManager cm = new ChatManager();

    public static ChatManager getChatManager() {
        return cm;
    }

    Vector<ChatSocket> vector = new Vector<ChatSocket>();

    public void add(ChatSocket cs) {
        vector.add(cs);
    }

    public void publish(ChatSocket cs, String out) {
        for (int i = 0; i < vector.size(); i++) {
            ChatSocket cschatSocket = vector.get(i);
            if (!cs.equals(cschatSocket)) {//发送消息的对象不接受消息本身
                cschatSocket.out(out);
            }
        }
    }
}


