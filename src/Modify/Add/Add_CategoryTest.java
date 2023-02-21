package Modify.Add;

import Contents.Category;
import Documents.Read_Category;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Add_CategoryTest {
    @Test
    void newProfesionalCategory() throws IOException {

        Add_Category addCategory = new Add_Category();
        Read_Category category = new Read_Category();
        category.leer();
        String id = "1234";
        Category category1 = new Category(id);
        Read_Category.categories.add(category1);
        assertEquals(10, Read_Category.categories.size());
    }
}