package application;

import entities.DataParserTxt;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        DataParserTxt dpt = new DataParserTxt();
        List<String> list = dpt.templateMethod();
        for (String string : list) {
            System.out.println(string);
        }
    }
}
