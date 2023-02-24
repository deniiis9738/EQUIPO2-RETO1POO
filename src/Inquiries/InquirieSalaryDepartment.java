package Inquiries;

import Contents.Cotization;
import Contents.Department;
import Contents.Employee;
import Documents.Read_Cotization;
import Documents.Read_Department;
import Documents.Read_Empleoyee;

/**
 * @author Denis Andres Ion Badea
 * @version v2
 * Función que consulta el salario de un departamento entero
 */
public class InquirieSalaryDepartment extends Inquiries {
    @Override
    public void realizeInquirie() {
        for (Department departamento : Read_Department.departments) {
            int suma = 0;
            for (Employee empleado : Read_Empleoyee.empleoyee) {
                if (empleado.getIdDep() == departamento.getIdDep()) {
                    Cotization salario = getSalarioPorGradoCotizacion(empleado.getGCotizacion());
                    if (salario != null) {
                        suma += salario.getDinero();
                    }
                }
            }
            System.out.println("El departamento " + departamento.getNombreDep() + " tiene un salario de: " + suma + "€");
        }
    }

    private static Cotization getSalarioPorGradoCotizacion(int gCotizacion) {
        for (Cotization salario : Read_Cotization.cotization) {
            if (salario.getGCot() == gCotizacion) {
                return salario;
            }
        }
        return null;
    }
}
