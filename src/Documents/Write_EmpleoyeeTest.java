package Documents;

import Contents.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Write_EmpleoyeeTest {

    @Test
    void guardar() {
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

        assertEquals(30, Read_Empleoyee.empleoyee.size());
    }
}