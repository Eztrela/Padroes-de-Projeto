package org.example;

public class User {
    protected String name;
    private Chat chat;

    public User(String name){
        this.name = name;
    }

    public void setChat(Chat chat){
        this.chat = chat;
    }

    public void sendMessage(String msg){
        this.chat.sendMessage(msg, this);
    }

}
