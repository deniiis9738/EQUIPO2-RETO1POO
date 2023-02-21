package Modify.Add;

import Contents.Category;
import Contents.Employee;
import Documents.Read_Category;
import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Add_EmployeeTest {
    @Test
    void incorporarEmpleados() {

        Add_Employee addEmployee = new Add_Employee();
        Read_Empleoyee empleoyee = new Read_Empleoyee();
        Employee employee1 = new Employee("1234-A","Juan", "Perez", "Calle 1",
                "123456789", "3","3","3",3,"P",3);

        try {
            empleoyee.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Employee employee : Read_Empleoyee.empleoyee) {
            System.out.printf(employee.getNIF(), employee.getNombre());
            System.out.println();
              }
}
    }
