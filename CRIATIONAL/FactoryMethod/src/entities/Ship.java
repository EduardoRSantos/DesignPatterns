package entities;
public class Ship implements Transport{

    @Override
    public void delivery() {
        System.out.println("Navegar pelo mar");
    }
    
}
