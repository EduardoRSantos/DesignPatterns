package entities;
public class RoadLogist extends Logistcs{

    @Override
    public Transport createTranport() {
        return new Truck();
    }
}
