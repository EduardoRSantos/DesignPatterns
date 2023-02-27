package factorys;

import interfaces.Button;
import interfaces.ButtonLinux;
import interfaces.CheckBox;
import interfaces.CheckBoxLinux;

public class LinuxFactory extends GuiFactory{

    @Override
    public Button createButton() {
        return new ButtonLinux();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxLinux();
    }
    
}
