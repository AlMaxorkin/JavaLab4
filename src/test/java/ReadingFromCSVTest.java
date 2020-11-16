import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadingFromCSVTest {
    /**
     * Тест
     */
    @Test
    public void fileRead(){
        var personArrayList = new ArrayList<Person>();
        ReadingFromCSV.fileReadToList(personArrayList);
        assertEquals(28281, personArrayList.get(0).id);
        assertEquals(28281 + 60, personArrayList.get(60).id);
        assertEquals(54178, personArrayList.get(personArrayList.size() -1).id);

        assertEquals(personArrayList.get(61).name, "Abd Al Matin" );

        assertEquals("28281; Aahan; Male; Fri May 15 00:00:00 MSK 1970; 1; I; 4800", personArrayList.get(0).toString());
        assertEquals("28481; Abra; Female; Wed Jul 18 00:00:00 MSK 1973; 201; B; 3500", personArrayList.get(200).toString());
        assertEquals("54178; Zyta; Female; Sat Apr 16 00:00:00 MSK 1955; 25898; H; 7600", personArrayList.get(personArrayList.size() -1).toString());
    }
}