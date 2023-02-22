package Documents;

import Contents.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Read_EmpleoyeeTest {
        @Test
        void leer() {
            Read_Empleoyee readEmpleoyee = new Read_Empleoyee();
            try {
                readEmpleoyee.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            for (Employee employee : Read_Empleoyee.empleoyee) {
                System.out.printf(employee.getNIF());
                System.out.println();
            }

            assertEquals(29, Read_Empleoyee.empleoyee.size());
        }
    }
}