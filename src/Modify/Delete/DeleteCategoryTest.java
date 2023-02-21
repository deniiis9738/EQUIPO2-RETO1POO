package Modify.Delete;

import Contents.Category;
import Documents.Read_Category;
import Modify.Add.Add_Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Contents.Category;
import Documents.Read_Category;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class DeleteCategoryTest{

    @Test
    void borrarCategoriaProfesional() throws IOException {

        Add_Category addCategory = new Add_Category();
        Read_Category category = new Read_Category();
        category.leer();
        String id = "1234";
        Category category1 = new Category(id);
        Read_Category.categories.remove(category1);
        assertEquals(10, Read_Category.categories.size());
    }
}