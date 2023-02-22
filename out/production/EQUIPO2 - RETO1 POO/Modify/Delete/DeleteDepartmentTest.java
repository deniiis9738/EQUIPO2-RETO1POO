package Modify.Delete;

import Contents.Category;
import Contents.Department;
import Documents.Read_Category;
import Modify.Add.Add_Category;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDepartmentTest {



    @Test
    void borrarDepartamento() throws IOException {
        String id = "A3";
        int idDep = 1;
        Department department1 = new Department(1,id);
        Read_Category.categories.remove(department1);
        assertEquals(3, Read_Category.categories.size());
    }
}