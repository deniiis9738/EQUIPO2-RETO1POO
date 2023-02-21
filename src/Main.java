import Documents.Read_Empleoyee;
import Documents.Write_Empleoyee;
import Inquiries.InquirieEmployee;
import Modify.Add.Add_Employee;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        InquirieEmployee hola = new InquirieEmployee();
        Read_Empleoyee employee = new Read_Empleoyee();
        Write_Empleoyee write = new Write_Empleoyee();
        Add_Employee add = new Add_Employee();
        employee.leer();
        //hola.realizeInquirie()
        add.realizeAdd();
        write.guardar();

    }
}