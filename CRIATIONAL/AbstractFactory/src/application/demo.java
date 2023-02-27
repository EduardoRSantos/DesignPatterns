package application;

import factorys.GuiFactory;
import factorys.LinuxFactory;
import factorys.WindowsFactory;
import java.util.Scanner;

public class demo {
    public static Program configApplication(){
        Program app;
        GuiFactory factory;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o sistema");
        String sistema = in.nextLine().toLowerCase();
        if(sistema.equals("windows")){
            factory = new WindowsFactory();
        }else{
            factory = new LinuxFactory();
        }
        app = new Program(factory);
        return app;
    }
    public static void main(String[] args) {
        Program app = configApplication();
        app.paint();
    }
}
