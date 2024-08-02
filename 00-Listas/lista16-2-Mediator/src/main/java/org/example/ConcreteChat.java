package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements Chat{
    private List<User> users;

    public ConcreteChat(){
        this.users=new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
        user.setChat(this);
    }

    public void sendMessage(String msg, User user){
        for(User otherUser: this.users){
            if(otherUser!=user){
                System.out.println(otherUser.name+" Recebeu: "+msg);
            }
        }
    }
}
