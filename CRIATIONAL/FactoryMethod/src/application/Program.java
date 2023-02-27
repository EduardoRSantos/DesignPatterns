package application;

import entities.Logistcs;
import entities.SeaLogist;

public class Program {
    public static void main(String[] args) {
        Logistcs logistic = new SeaLogist();
        logistic.planDelivery();
    }
    
}
