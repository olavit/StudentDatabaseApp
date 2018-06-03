package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null) {
                String[] datarecords = dataRow.split(",");
                data.add(datarecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can not find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File can not read");
            e.printStackTrace();
        }
        return data;
    }
}
