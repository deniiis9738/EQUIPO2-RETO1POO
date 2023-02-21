package Inquiries;

import Documents.Read_Department;
import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class
InquirieCountEmployee_DepartmentTest {

    @Test
    void realizeInquirie() {
        Read_Department department = new Read_Department();
        Read_Empleoyee empleoyee = new Read_Empleoyee();
        InquirieCountEmployee_Department inquirieCountEmployeeDepartment = new InquirieCountEmployee_Department();
        try {
            department.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            empleoyee.leer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inquirieCountEmployeeDepartment.realizeInquirie();
    }
}