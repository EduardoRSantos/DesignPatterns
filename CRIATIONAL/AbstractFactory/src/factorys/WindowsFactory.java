package factorys;

import interfaces.Button;
import interfaces.ButtonWindows;
import interfaces.CheckBox;
import interfaces.CheckBoxWindows;

public class WindowsFactory extends GuiFactory{

    @Override
    public Button createButton() {
        return new ButtonWindows();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxWindows();
    }
    
}
