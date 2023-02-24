package Test.Modify.Add;

import Contents.Employee;
import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Carlos Hernandez Garcia
 * @version V2
 * Esta clase hace las pruebas unitarias de la clase Add_Employee
 */
class Add_EmployeeTest {
    @Test
    void incorporarEmpleados() {

        Read_Empleoyee empleoyee = new Read_Empleoyee();

        try {
            empleoyee.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Employee employee1 = new Employee("1234-A", "Juan", "Perez", "Calle 1",
                "123456789", "3", "3", "3", 3, "P", 3);

        Read_Empleoyee.empleoyee.add(employee1);
        assertEquals(30, Read_Empleoyee.empleoyee.size());
    }
}
