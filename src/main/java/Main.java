import com.opencsv.CSVReader;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alexandr Makhorkin
 * @version 1.0
 * Main class
 */
public class Main {
    /**
     * Производится вывод на экран содержимого списка
     * @param args
     */
    public static void main(String[] args) {
        var personArrayList = new ArrayList<Person>();
        ReadingFromCSV.fileReadToList(personArrayList);
        for(Person person : personArrayList){
            System.out.println(person.toString());
        }
    }
}
