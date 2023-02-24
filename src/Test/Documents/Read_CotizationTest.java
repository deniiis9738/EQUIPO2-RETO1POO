package Test.Documents;

import Contents.Cotization;
import Documents.Read_Cotization;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Eduard
 * Test para probar Read_Cotization
 */
class Read_CotizationTest {

    @Test
    void leer() {
        Read_Cotization readCotization= new Read_Cotization();
        try {
            readCotization.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Cotization cotization : Read_Cotization.cotization) {
            System.out.printf(String.valueOf(cotization.getGCot()));
            System.out.println();
        }

        assertEquals(9, Read_Cotization.cotization.size());
    }
}