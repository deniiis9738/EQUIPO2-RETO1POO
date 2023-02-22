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
        String id = "A3";
        Category category1 = new Category(id);
        Read_Category.categories.remove(category1);
        assertEquals(8, Read_Category.categories.size());
    }
}