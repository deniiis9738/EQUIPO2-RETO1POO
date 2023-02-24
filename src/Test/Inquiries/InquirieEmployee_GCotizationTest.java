package Test.Inquiries;

import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;



import Documents.Read_Department;
import Inquiries.InquirieEmployee_GCotization;

import java.io.IOException;


class InquirieEmployee_GCotizationTest {
    /**
     * @author Eduard
     * Test para probar InquirieEmployee_GCotization
     */
    @Test
    void realizeInquirie() {

        Read_Department department = new Read_Department();
        Read_Empleoyee empleoyee = new Read_Empleoyee();
        InquirieEmployee_GCotization inquirieEmployeeGCotization = new InquirieEmployee_GCotization();
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
        inquirieEmployeeGCotization.realizeInquirie();

    }


}