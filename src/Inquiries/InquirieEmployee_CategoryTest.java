package Inquiries;

import Documents.Read_Category;
import Documents.Read_Department;
import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InquirieEmployee_CategoryTest {

    @Test
    void realizeInquirie() {
        Read_Department department = new Read_Department();
        Read_Empleoyee empleoyee = new Read_Empleoyee();
        Read_Category category = new Read_Category();
        InquirieEmployee_Category inquirieEmployee_category = new InquirieEmployee_Category();
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
        try {
            category.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        inquirieEmployee_category.realizeInquirie();
    }
}