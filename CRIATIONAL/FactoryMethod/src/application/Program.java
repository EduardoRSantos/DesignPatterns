package application;

import entities.Logistcs;
import entities.RoadLogist;
import entities.SeaLogist;

public class Program {
    public static void main(String[] args) {
        Logistcs logistic = new SeaLogist();
        logistic.planDelivery();
        Logistcs logistic2 = new RoadLogist();
        logistic2.planDelivery();
    }
    
}
