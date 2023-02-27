package interfaces;

import interfaces.Button;

public class ButtonLinux implements Button {

    @Override
    public void paint() {
        System.out.println("You have created LinuxButton.");
    }

}
