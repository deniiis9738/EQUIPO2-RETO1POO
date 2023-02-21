package Documents;

import Contents.Department;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Read_DepartmentTest {

    @Test
    void leer() {
        Read_Department readDepartment = new Read_Department();
        try {
            readDepartment.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Department department : Read_Department.departments) {
            System.out.printf(department.getNombreDep());
            System.out.println();
        }

        assertEquals(4, Read_Department.departments.size());
    }
}