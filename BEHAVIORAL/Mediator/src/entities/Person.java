package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<String> chat_log;
    private ChatRoom chat_room;

    public Person(String name) {
        this.name = name;
        chat_log = new ArrayList<>();
    }
    
    public void receive(String sender, String message){
        String s = sender + " : " + message;
        System.out.printf("[%s 's chat session] %s \n",this.name,s);
        chat_log.add(s);
    }
    
    public void say(String message){
        chat_room.broadcast(this.name, message);
    }
    
    public void private_message(String who, String message){
        chat_room.message(this.name, who, message);
    }
    
    public void setChatRoom(ChatRoom chat_room){
        this.chat_room = chat_room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
