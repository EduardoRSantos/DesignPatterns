package interfaces;

import interfaces.Button;

public class ButtonWindows implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }

}
