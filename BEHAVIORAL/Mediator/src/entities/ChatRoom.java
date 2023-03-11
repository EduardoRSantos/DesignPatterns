package entities;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String name;
    private List<Person> peoples = new ArrayList<>();
    public ChatRoom() {
        this.name = "room";
    }
    
    public void join(Person person){
        person.setChatRoom(this);
        broadcast(this.name , person.getName() + " joins the chat");
        peoples.add(person);
    }
    public void broadcast(String name, String message){
        for (Person people : peoples) {
            if(!people.getName().equals(name)){
                people.receive(name, message);
            }
        }
    }
    
    public void message(String name,String destino,String message){
        for (Person people : peoples) {
            if(people.getName().equals(destino)){
                people.receive(name, message);
            }
        }
    }

}