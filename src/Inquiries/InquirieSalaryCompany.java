package Inquiries;

import Contents.Cotization;
import Contents.Employee;
import Documents.Read_Cotization;
import Documents.Read_Empleoyee;

public class InquirieSalaryCompany extends Inquiries {

    private static int[] cantECod = new int[7];

    public static void consultarEmpleadosGrupoCotizacion() {

        int contador = 0;
        int i = -1;

        for (Cotization salario1 : Read_Cotization.cotization) {
            i++;
            for (Employee empleados1 : Read_Empleoyee.empleoyee) {

                int Gcotizacion = empleados1.getGCotizacion();
                int NGCotizacion = salario1.getGCot();

                if (Gcotizacion == NGCotizacion) {
                    contador++;
                }
                cantECod[i] = contador;
            }
            contador = 0;
        }
    }

    @Override
    public void realizeInquirie() {
        consultarEmpleadosGrupoCotizacion();
        int suma = 0;
        int i = 0;
        for (Cotization salario1 : Read_Cotization.cotization) {
            suma += salario1.getDinero() * cantECod[i];
            i++;
        }

        System.out.println("El coste salarial de la empresa es: " + suma + "€");
    }
}
