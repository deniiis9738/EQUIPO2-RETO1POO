package Inquiries;

import Contents.Category;
import Contents.Cotization;
import Contents.Employee;
import Documents.Read_Category;
import Documents.Read_Cotization;
import Documents.Read_Empleoyee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class InquirieSalary_GCotization extends Inquiries {

    private static Scanner inputValue = new Scanner(System.in);
    private static ArrayList<Employee> auxE = new ArrayList<>();



    @Override
    public void realizeInquirie() {

        int suma = 0;
        int salarioEmpleado = 0;
        String idCatPro = "";
        boolean error = true;

        System.out.print("Introduce la categoría profesional a consultar: ");
        idCatPro = inputValue.next();
        for (Category categories1 : Read_Category.categories) {
            if (categories1.getCategoria().equals(idCatPro)) {
                error = false;
            }
        }
        while (error) {
            System.out.print("La categoría profesional introducida no es válida, por favor introdúcela de nuevo: ");
            idCatPro = inputValue.next();
            for (Category categories1 : Read_Category.categories) {
                if (categories1.getCategoria().equals(idCatPro)) {
                    error = false;
                }
            }
        }
        for (Category categoria2 : Read_Category.categories) {
            if (categoria2.getCategoria().equals(idCatPro)) {
                for (Employee empleados1 : Read_Empleoyee.empleoyee) {
                    for (Cotization salario : Read_Cotization.cotization) {
                        if (empleados1.getCatGProfesional().equals(idCatPro)) {
                            Employee empleados2 = new Employee(empleados1.getNIF(), empleados1.getNombre(), empleados1.getApellido1(), empleados1.getApellido2(), empleados1.getCuenta(),
                                    empleados1.getAntiguedad(), empleados1.getNASeguridadSocial(), empleados1.getCatGProfesional(), empleados1.getGCotizacion(), empleados1.getEmail(), empleados1.getIdDep());
                            auxE.add(empleados2);
                            salarioEmpleado = salario.getDinero();
                            suma += salarioEmpleado;
                        }
                        break;
                    }
                }
                System.out.println("La categoría profesional " + categoria2.getCategoria() + " tiene un salario de " + suma + "€.");
            }
            error = false;
        }


    }
}
