package Modify.Delete;

import Contents.Department;
import Documents.Read_Department;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDepartmentTest {



    @Test
    void borrarDepartamento() throws IOException {

        Read_Department read_department = new Read_Department();
        read_department.read();
        String id = "Informatica";
        for (Department department1 : Read_Department.departments) {
            if (department1.getNombreDep().equals(id)) {
                Read_Department.departments.remove(department1);
                break;
            }
        }
        assertEquals(3, Read_Department.departments.size());

    }
}