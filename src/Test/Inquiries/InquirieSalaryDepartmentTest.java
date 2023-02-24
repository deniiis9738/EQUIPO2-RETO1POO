package Test.Inquiries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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