package Inquiries;
import Contents.Employee;
import Documents.Read_Empleoyee;

import java.util.Scanner;

public class InquirieEmployee_Category extends Inquiries{

    private static Scanner inputValue = new Scanner(System.in);
    private static int identificador;
    @Override
    public void realizeInquirie() {
        try {
            System.out.print("Introduce grupo de cotización: ");
            identificador = Integer.parseInt(inputValue.next());
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("El grupo de cotización introducido no es válido, por favor introdúcela de nuevo");
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-10s%-28s%-15s%-15s\n",
                "NIF",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "Cuenta",
                "Antigüedad",
                "N. SS",
                "Categoria G.Profesional",
                "G.Cotización",
                "Id Departamento");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        for (Employee empleados1 : Read_Empleoyee.empleoyee) {

            if (empleados1.getGCotizacion() == identificador) {

                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-19s%-24s%-17s%-15s\n",
                        empleados1.getNIF(),
                        empleados1.getNombre(),
                        empleados1.getApellido1(),
                        empleados1.getApellido2(),
                        empleados1.getCuenta(),
                        empleados1.getAntiguedad(),
                        empleados1.getNASeguridadSocial(),
                        empleados1.getCatGProfesional(),
                        empleados1.getGCotizacion(),
                        empleados1.getIdDep());

            }
        }
        System.out.println();
    }
}
