package Test.Documents;

import Contents.Category;
import Documents.Read_Category;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Iker Rodriguez Montava
 * @version v2
 * @throws IOException
 * Esta clase nos sirve para testear el funcionamiento de la clase Categoria
 */

class Write_CategoryTest {

    @Test
    void guardar() {
        Read_Category readCategory = new Read_Category();
        try {
            readCategory.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Category category : Read_Category.categories) {
            System.out.printf(category.getCategoria());
            System.out.println();
        }

        assertEquals(8, Read_Category.categories.size());
    }
}