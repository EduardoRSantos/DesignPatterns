package application;

import entites.Person;
import entites.ProxyPerson;

public class Program {
    
    public static void main(String[] args) {
        ProxyPerson proxy_person = new ProxyPerson(new Person(18));
        System.out.println(proxy_person.drink());
        System.out.println(proxy_person.drive());
        System.out.println(proxy_person.drink_and_drive());

    }
    
}
