package Documents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Read_CategoryTest {

    Read_Category readCategory = new Read_Category();

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