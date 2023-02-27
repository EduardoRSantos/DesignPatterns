package entities;
public class SeaLogist extends Logistcs{

    @Override
    public Transport createTranport() {
        return new Ship();
    }
}
