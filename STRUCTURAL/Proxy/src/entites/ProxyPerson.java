package entites;
public class ProxyPerson{
    private Person person;

    public ProxyPerson(Person person) {
        this.person = person;
    }
    
    public String drink(){
    return person.getAge() >= 18 ? person.drink() : "Muito jovem";
    }
    
    public String drive(){
        return person.getAge() >= 16 ? person.drive() : "Muito jovem";
    }
     public String drink_and_drive(){
         return person.drink_and_drive() + ", dead";
    }
}
