package Test.Inquiries;

import Documents.Read_Cotization;
import Documents.Read_Hours;
import Inquiries.InquirieHoursDepartment;
import Inquiries.InquirieSalary_GCotization;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
    /**
    * @author Eduard
    * Test para probar InquirieSalary_GCotization
    */
class InquirieSalary_GCotizationTest {

    @Test
    void realizeInquirie() {

        Read_Cotization readCotization = new Read_Cotization();
        InquirieSalary_GCotization inquirieSalaryGCotization = new InquirieSalary_GCotization();
        try {
            readCotization.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inquirieSalaryGCotization.realizeInquirie();

    }
}