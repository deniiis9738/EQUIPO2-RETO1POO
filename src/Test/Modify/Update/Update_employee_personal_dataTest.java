package Test.Modify.Update;

import Contents.Employee;
import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Carlos Hernandez Garcia
 * @version V2
 * Esta clase hace las pruebas unitarias de la clase Update_employee_personal_data
 */
class Update_employee_personal_dataTest {

    @Test
    void modifyEmployee() {
        Read_Empleoyee read_empleoyee = new Read_Empleoyee();
        try {
            read_empleoyee.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int i = -1;
        String nombre = "GARGAMEL";
        String nombreNuevo = "cambioNombre1";

       Employee employeeNuevo = new Employee("12345682-E",nombreNuevo,"ROMPE","TECHOS","grompet","03/11/2019","","B2",5,"grompet@empresa2.com", 4);

        for (Employee employee1 : Read_Empleoyee.empleoyee) {
            i++;
            if (employee1.getNombre().equals(nombre)) {
                Read_Empleoyee.empleoyee.set(i, employeeNuevo);
                break;
            }
        }

        for (Employee employee1 : Read_Empleoyee.empleoyee) {
            if (employee1.getNombre().equals(nombreNuevo)) {
                assertEquals("cambioNombre1", employee1.getNombre());
                break;
            }
        }

    }
}