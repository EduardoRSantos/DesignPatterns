package entites;
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String drink(){
        return "drinking";
    }
    
    public String drive(){
        return "driving";
    }
     public String drink_and_drive(){
         return "driving while drunk";
     }
}
