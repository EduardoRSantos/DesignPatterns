package entities;
public class Truck implements Transport{

    @Override
    public void delivery() {
        System.out.println("Navegar pelas estradas");
    }
}
