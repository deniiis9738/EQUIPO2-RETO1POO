package Test.Inquiries;

import Documents.Read_Empleoyee;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import Documents.Read_Department;
import Documents.Read_Empleoyee;
import Inquiries.InquirieEmployee_GCotization;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InquirieEmployee_GCotizationTest {
    /**
     * @author Eduard
     * Test para probar InquirieEmployee_GCotization
     */
    @Test
    void realizeInquirie() {

        /*Read_Department department = new Read_Department();
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
        inquirieEmployeeGCotization.realizeInquirie();*/

    }
    public static Scanner setinputValue = new Scanner(System.in);

    @Test
    public void testRealizeInquirie() {
        // Setup
        InquirieEmployee_GCotization inquiry = new InquirieEmployee_GCotization();
        //inquiry.setInputValue(new Scanner("2\n")); // Simula la entrada del usuario como si hubiera ingresado "2"
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirecciona la salida de la consola a outputStream

        // Ejecución
        inquiry.realizeInquirie();
        String actualOutput = outputStream.toString();

        // Verificación
        String expectedOutput = "Introduce grupo de cotización: \n" +
                "NIF            Nombre         Apellido1      Apellido2      Cuenta         Antigüedad     N. SS        " +
                "Categoria G.Profesional   G.Cotización  Id Departamento\n" +
                "------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------\n" +
                "12345678A      Pepe           Pérez          Pérez          ES0123456789   5 años         11111111111   " +
                "Profesor                  2             1\n" +
                "\n";
        assertEquals(expectedOutput, actualOutput);
    }


}