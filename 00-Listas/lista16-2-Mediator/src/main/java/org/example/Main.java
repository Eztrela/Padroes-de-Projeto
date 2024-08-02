package org.example;

public class Main {

    public static void main(String[] args) {
        Chat chat = new ConcreteChat();
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);
        user1.setChat(chat);
        user1.sendMessage("Hello");
        user3.sendMessage("Hi user1");

    }

}