package factorys;

import interfaces.Button;
import interfaces.CheckBox;

public abstract class GuiFactory {

    public abstract Button createButton();

    public abstract CheckBox createCheckBox();
}
