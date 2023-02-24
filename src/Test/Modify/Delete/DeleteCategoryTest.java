package Test.Modify.Delete;

import Contents.Category;
import Documents.Read_Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
/**
 * @author Iker Rodriguez Montava
 * @version v2
 * @throws IOException
 * Esta clase nos sireve para testear el funcionamiento de la clase borrar Categoria
 */

class DeleteCategoryTest{

    @Test
    void borrarCategoriaProfesional() throws IOException {
        Read_Category read_category = new Read_Category();
        read_category.read();
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