package Test.Documents;

import Contents.Hours;
import Documents.Read_Hours;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Eduard
 * Test para probar Read_Hours
 */

class Read_HoursTest {

    @Test
    void leer() {
        Read_Hours read_hours = new Read_Hours();
        try {
            read_hours.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Hours hours : Read_Hours.hours) {
            System.out.printf(hours.getNIF());
            System.out.println();
        }

        assertEquals(13, Read_Hours.hours.size());
    }
}