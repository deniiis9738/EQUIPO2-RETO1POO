package Test.Inquiries;

import Documents.Read_Department;
import Documents.Read_Empleoyee;
import Inquiries.InquirieEmployee_idDepartment;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InquirieEmployee_idDepartmentTest {

    @Test
    void realizeInquirie() {
        Read_Department department = new Read_Department();
        Read_Empleoyee empleoyee = new Read_Empleoyee();
        InquirieEmployee_idDepartment inquirieEmployeeIdDepartment = new InquirieEmployee_idDepartment();
        try {
            department.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            empleoyee.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inquirieEmployeeIdDepartment.realizeInquirie();
    }
}