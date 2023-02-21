package Inquiries;

import Contents.Department;
import Contents.Employee;
import Documents.Read_Department;
import Documents.Read_Empleoyee;

import java.util.Scanner;

public class InquirieEmployee_idDepartment extends Inquiries{

    private int identificador;
    private Scanner inputValue = new Scanner(System.in);

    @Override
    public void realizeInquirie() {
        departmentInquirieMenu();

        for (Employee empleados1 : Read_Empleoyee.empleoyee) {

            if (empleados1.getIdDep() == identificador) {

                printEmployeeDepartment(empleados1);

            }
        }
        System.out.println();
    }

    public int departmentInquirieMenu() {
        System.out.print("Introduce el ID del departamento: ");
        identificador = inputValue.nextInt();
        System.out.println();

        System.out.println("Nombre departamento");

        for (Department departamentos1 : Read_Department.departments) {
            if (departamentos1.getIdDep() == identificador) {
                System.out.println(departamentos1.getNombreDep());
            }
        }
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
        return identificador;
    }

    private static void printEmployeeDepartment(Employee empleados1) {
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
