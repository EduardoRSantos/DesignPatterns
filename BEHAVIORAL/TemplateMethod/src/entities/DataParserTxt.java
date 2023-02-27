package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataParserTxt extends CustomDataParser {

    @Override
    public List<String> fileReader() {
        String path = "c:\\in.txt";
        List<String> list = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }
            return list;
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return list;

    }

}
