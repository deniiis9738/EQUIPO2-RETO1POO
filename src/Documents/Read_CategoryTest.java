package Documents;

import Contents.Category;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Read_CategoryTest {

    @Test
    void leer() {
        Read_Category readCategory = new Read_Category();
        try {
            readCategory.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Category category : Read_Category.categories) {
            System.out.printf(category.getCategoria());
            System.out.println();
        }

        assertEquals(9, Read_Category.categories.size());
    }
}