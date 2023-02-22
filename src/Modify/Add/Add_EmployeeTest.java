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

        Read_Empleoyee empleoyee = new Read_Empleoyee();

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
