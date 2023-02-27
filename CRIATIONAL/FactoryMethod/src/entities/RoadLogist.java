package entities;
public class RoadLogist extends Logistcs{

    @Override
    public Transport createTranport() {
        Truck truck = new Truck();
        return truck;
    }
}
