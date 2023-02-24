package Test.Inquiries;

import Documents.Read_Department;
import Inquiries.InquirieHoursDepartment;
import Inquiries.InquirieSalaryDepartment;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Eduard
 * Test para probar InquirieSalaryDepartment
 */
class InquirieSalaryDepartmentTest {

    @Test
    void realizeInquirie() {
            Read_Department readDepartment = new Read_Department();
            InquirieSalaryDepartment inquirieSalaryDepartment = new InquirieSalaryDepartment();
            try {
                readDepartment.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            inquirieSalaryDepartment.realizeInquirie();
        }

}