package Inquiries;

import PROYECTOANTIGUO.Cotization;
import PROYECTOANTIGUO.Empleoyee;
import PROYECTOANTIGUO.Hours;

import java.io.IOException;
import java.util.ArrayList;

import static PROYECTOANTIGUO.Reto1.inputValue;

public class Department {

    public static ArrayList<PROYECTOANTIGUO.Department> departamentos = new ArrayList<>();

    public static ArrayList<Cotization> cotizations = new ArrayList<>();

    public static ArrayList<Empleoyee> empleados = new ArrayList<>();

    public static ArrayList<Empleoyee> auxE = new ArrayList<>();
    public static ArrayList<Hours> horas = new ArrayList<>();

    public static void consultarSalarioDepartamento() throws IOException {
        for (PROYECTOANTIGUO.Department departamento : departamentos) {
            int suma = 0;
            for (Empleoyee empleado : empleados) {
                if (empleado.getIdDep() == departamento.getIdDep()) {
                    Cotization cotization = getSalarioPorGradoCotizacion(empleado.getGCotizacion());
                    if (cotization != null) {
                        suma += cotization.getDinero();
                    }
                }
            }
            System.out.println("El departamento " + departamento.getNombreDep() + " tiene un salario de: " + suma + "€");
        }
    }


    private static Cotization getSalarioPorGradoCotizacion(int gCotizacion) {
        for (Cotization cotization : cotizations) {
            if (cotization.getGCot() == gCotizacion) {
                return cotization;
            }
        }
        return null;
    }


    public static void consultarHorasExtrasDepartamento() {

        int horasExtras = 0;
        System.out.println("1.- Comercial");
        System.out.println("2.- Contabilidad");
        System.out.println("3.- Informatica");
        System.out.println("4.- Personal");
        System.out.println();
        System.out.println("Introduce el departamento a consultar las horas extras: ");
        int eleccion = inputValue.nextInt();

        for (Empleoyee empleoyee1 : empleados) {
            for (Hours hours1 : horas) {
                if (empleoyee1.getIdDep() == eleccion) {
                    Empleoyee empleoyee2 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                            empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(), empleoyee1.getIdDep());
                    auxE.add(empleoyee2);
                    if (empleoyee1.getNIF().equals(hours1.getNIF())) {
                        horasExtras += hours1.getHoras();
                    }
                }
            }
        }
        System.out.println();
        System.out.println("EL departamento " + eleccion + " tiene " + horasExtras + " horas extras realizadas en total.");
    }


}
