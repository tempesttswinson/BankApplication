package utilties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    // this method will read data from a CSV file and return as a list (helper
    // method)
    // static so we can access at any time
    public static List<String[]> read(String file) {

        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        // reads in a file
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // br.readLine() only reads one line at a time so the while loop allows us to
            // read all the lines in the file
            while ((dataRow = br.readLine()) != null) {
                // seperates each row by commons and puts each element into array
                String[] dataRecords = dataRow.split(",");
                // takes each array created from the seperated elements and puts them into the
                // data LinkedList
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }

        return data;

    }
}