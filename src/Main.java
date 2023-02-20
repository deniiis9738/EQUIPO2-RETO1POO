import Documents.Read_Empleoyee;
import Inquiries.InquirieEmployee;
import Inquiries.Inquiries;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        InquirieEmployee hola = new InquirieEmployee();
        Read_Empleoyee employee = new Read_Empleoyee();
        employee.leer();
        hola.realizeInquirie();

    }
}