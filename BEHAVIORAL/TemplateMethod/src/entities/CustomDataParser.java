package entities;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CustomDataParser {

    public List<String> templateMethod() {
        List<String> list = fileReader();
        cpfFixed(list);
        return list;
    }

    public abstract List<String> fileReader();

    private void cpfFixed(List<String> list) {
        for (String string : list) {
            String[] fields = string.split(",");
            System.out.println(fields[2].replaceAll("[.-]", ""));
        }

        
    }
;
}
