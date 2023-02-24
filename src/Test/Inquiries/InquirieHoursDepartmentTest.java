package Test.Inquiries;

import Documents.Read_Hours;
import Inquiries.InquirieHoursDepartment;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InquirieHoursDepartmentTest {
    /**
     * @author Eduard
     * Test para probar InquirieHoursDepartment
     */
    @Test
    void realizeInquirie() {
        Read_Hours readHours = new Read_Hours();
        InquirieHoursDepartment inquirieHoursDepartment = new InquirieHoursDepartment();
        try {
            readHours.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inquirieHoursDepartment.realizeInquirie();
    }
}