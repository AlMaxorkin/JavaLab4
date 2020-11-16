import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *Класс для чтения
 */
public class ReadingFromCSV {

    /**
     * Записвыает содержимое CSV файла в список
     * @param personArrayList список в который будут записываться строки из файла
     */
    public static void fileReadToList(ArrayList<Person> personArrayList){
        try (InputStream in = ReadingFromCSV.class.getClassLoader().getResourceAsStream("foreign_names.csv");
             CSVReader reader = new CSVReader(new InputStreamReader(in), ';')) {
            if(reader == null){
                throw new FileNotFoundException("foreign_names.csv");
            }
        String[] nextLine;
        int divisionID = 1;
        while ((nextLine = reader.readNext()) != null){
            personArrayList.add(new Person(Integer.parseInt(nextLine[0]), nextLine[1], nextLine[2],
                    nextLine[3], new Division(divisionID, nextLine[4]),  Integer.parseInt(nextLine[5])));
            divisionID++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

