package Inquiries;

import Contents.Department;
import Contents.Employee;
import Documents.Read_Department;
import Documents.Read_Empleoyee;

/**
 * @author Denis Andres Ion Badea
 * @version v2
 * Función que consulta cantidad de empleados por cada departamento
 */

public class InquirieCountEmployee_Department extends Inquiries {
    @Override
    public void realizeInquirie() {
        System.out.printf("%-15s%-15s\n",
                "Departamento",
                "Cantidad");

        int contador = 0;

        for (Department departamentos1 : Read_Department.departments) {

            for (Employee empleados1 : Read_Empleoyee.empleoyee) {

                int idEmpleado = empleados1.getIdDep();
                int idDepartamento = departamentos1.getIdDep();

                if (idEmpleado == idDepartamento) {
                    contador++;

                }


            }

            System.out.printf("%-15s%-15s\n",
                    departamentos1.getNombreDep(),
                    contador);

            contador = 0;
        }
    }
}

