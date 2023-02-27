package appliaction;
public class Program {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance("Hello World!");
        Singleton instance2 = Singleton.getInstance("Olá Mundo!");
        
        System.out.println(instance.getValue());
        System.out.println(instance2.getValue());
    }
}
