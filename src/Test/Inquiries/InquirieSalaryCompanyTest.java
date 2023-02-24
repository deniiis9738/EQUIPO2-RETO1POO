package Test.Inquiries;

import Documents.Read_Cotization;
import Documents.Read_Department;
import Inquiries.InquirieHoursDepartment;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InquirieSalaryCompanyTest {
    /**
     * @author Eduard
     * Test para probar InquirieSalaryCompany
     */
    @Test
    void realizeInquirie() {
        Read_Department readDepartment = new Read_Department();
        InquirieHoursDepartment inquirieHoursDepartment = new InquirieHoursDepartment();
        try {
            readDepartment.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inquirieHoursDepartment.realizeInquirie();
    }
}