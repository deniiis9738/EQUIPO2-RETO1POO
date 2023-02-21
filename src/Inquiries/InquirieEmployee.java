package Inquiries;

import Contents.Employee;
import Documents.Read_Empleoyee;

import java.util.ArrayList;
import java.util.Scanner;

public class InquirieEmployee extends Inquiries {
    private String id;
    private Scanner inputValue = new Scanner(System.in);

    public ArrayList<Contents.Employee> empleoyee = new ArrayList<>();
    @Override
    public void realizeInquirie() {

        employeeInquirieMenu();
        for (Employee employee1 : Read_Empleoyee.empleoyee) {

            if (employee1.getNIF().equals(id)) {

                printeoConsultarEmpleados(employee1);

            }
        }
    }

    public String employeeInquirieMenu() {
        System.out.print("Introduce el NIF del empleado: ");
        id = inputValue.next();

        System.out.println();

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
        return id;
    }

    private static void printeoConsultarEmpleados(Employee empleados1) {
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
