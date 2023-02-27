package entities;
public abstract class Logistcs {
    
    public void planDelivery(){
        Transport transport = createTranport();
        transport.delivery();
    };
    public abstract Transport createTranport();
}
