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
        for (Category category1 : Read_Category.categories) {
            if (category1.getCategoria().equals(id)) {
                Read_Category.categories.remove(category1);
                break;
            }
        }
        assertEquals(8, Read_Category.categories.size());
    }
}