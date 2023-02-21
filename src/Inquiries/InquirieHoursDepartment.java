package Inquiries;
import Contents.Employee;
import Contents.Hours;
import Documents.Read_Empleoyee;
import Documents.Read_Hours;

import java.util.ArrayList;
import java.util.Scanner;

public class InquirieHoursDepartment extends Inquiries {
    private Scanner inputValue = new Scanner(System.in);
    private ArrayList<Employee> auxE = new ArrayList<>();

    @Override
    public void realizeInquirie() {
        int horasExtras = 0;
        System.out.println("1.- Comercial");
        System.out.println("2.- Contabilidad");
        System.out.println("3.- Informatica");
        System.out.println("4.- Personal");
        System.out.println();
        System.out.println("Introduce el departamento a consultar las horas extras: ");
        int eleccion = inputValue.nextInt();

        for (Employee empleados1 : Read_Empleoyee.empleoyee) {
            for (Hours horas1 : Read_Hours.hours) {
                if (empleados1.getIdDep() == eleccion) {
                    Employee empleados2 = new Employee(empleados1.getNIF(), empleados1.getNombre(), empleados1.getApellido1(), empleados1.getApellido2(), empleados1.getCuenta(),
                            empleados1.getAntiguedad(), empleados1.getNASeguridadSocial(), empleados1.getCatGProfesional(), empleados1.getGCotizacion(), empleados1.getEmail(), empleados1.getIdDep());
                    auxE.add(empleados2);
                    if (empleados1.getNIF().equals(horas1.getNIF())) {
                        horasExtras += horas1.getHoras();
                    }
                }
            }
        }
        System.out.println();
        System.out.println("EL departamento " + eleccion + " tiene " + horasExtras + " horas extras realizadas en total.");
    }
}
