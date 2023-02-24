package Test.Documents;

import Contents.Hours;
import Documents.Read_Hours;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Eduard
 * Test para probar Read_Department
 */
class Read_DepartmentTest {

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

        assertEquals(4, Read_Hours.hours.size());
    }
}