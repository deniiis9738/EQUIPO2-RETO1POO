package Documents;

import Contents.Hours;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Write_DepartmentTest {

    @Test
    void guardar() {
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

        assertEquals(5, Read_Hours.hours.size());
    }
}