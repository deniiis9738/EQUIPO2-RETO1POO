package Test.Documents;

import Contents.Cotization;
import Documents.Read_Cotization;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Iker Rodriguez Montava
 * @version v2
 * @throws IOException
 * Esta clase nos sirve para testear el funcionamiento de la clase Cotizacion
 */
class Write_CotizationTest {

    @Test
    void guardar() {
        Read_Cotization readCotization = new Read_Cotization();
        try {
            readCotization.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Cotization cotization : Read_Cotization.cotization) {
            System.out.printf(String.valueOf(cotization.getGCot()));
            System.out.println();
        }

        assertEquals(10, Read_Cotization.cotization.size());
    }
}
