package org.example;

public interface Chat {
    public void addUser(User user);
    public void sendMessage(String msg, User user);
}
