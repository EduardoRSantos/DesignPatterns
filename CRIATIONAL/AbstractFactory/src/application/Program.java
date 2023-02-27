package application;

import factorys.GuiFactory;
import interfaces.Button;
import interfaces.CheckBox;

public class Program {
    private CheckBox checkBox;
    private Button button;
    
    public Program(GuiFactory factory){
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }
    
    public void paint(){
        button.paint();
        checkBox.paint();
    }
}