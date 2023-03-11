package application;

import entities.ChatRoom;
import entities.Person;

public class Program {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        Person jefte = new Person("Jefte");
        Person brenno = new Person("Brenno");
        Person barbara = new Person("Barbara");

        room.join(jefte);
        room.join(brenno);
        room.join(barbara);
        jefte.say("Hi room!");
        brenno.say("Oh, hey Jefté, how are you?");
        brenno.say("Great.");
        barbara.say("Hi guys.");

        Person sabrina = new  Person("Sabrina");
        room.join(sabrina);

        sabrina.private_message("Jefté", "Meow ;P");
        
        
    }

}
