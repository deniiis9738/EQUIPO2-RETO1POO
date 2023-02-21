package Documents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Read_CategoryTest {

    Read_Category readCategory = new Read_Category();

    @Test
    void leer() {
        readCategory = new Read_Category();
    assertArrayEquals("A1, A2, A3, B1 , B2 , B3 , Z1 , Z2 , Z3" , readCategory.leer());

    }
}