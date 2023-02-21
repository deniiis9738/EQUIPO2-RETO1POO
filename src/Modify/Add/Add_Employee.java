package Modify.Add;

import Contents.Employee;
import Documents.Write_Empleoyee;
import Modify.Add.Add;

import java.util.Scanner;

import static Documents.Read_Empleoyee.empleoyee;

public class Add_Employee extends Add {

    Write_Empleoyee writeEmpleoyee = new Write_Empleoyee();

    @Override
    public void realizeAdd() {
        try {
            incorporarEmpleados();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void incorporarEmpleados() throws Exception{
        Scanner inputValue = new Scanner(System.in);

        String antiguedad = "";
        System.out.print("Introduce el NIF del nuevo empleado: ");
        String NIF = inputValue.next();
        System.out.print("Introduce el Nombre del nuevo empleado: ");
        String nombreEmpleado = inputValue.next();
        System.out.print("Introduce el Apellido1 del nuevo empleado: ");
        String apellido1Empleado = inputValue.next();
        System.out.print("Introduce el Apellido2 del nuevo empleado: ");
        String apellido2Empleado = inputValue.next();
        System.out.print("Introduce la cuenta de usuario del nuevo empleado: ");
        String cuentaEmpleado = inputValue.next();
        System.out.print("Introduce el número de seguridad social del nuevo empleado: ");
        String nSS = inputValue.next();
        System.out.print("Introduce la categoría profesional del nuevo empleado: ");
        String catProf = inputValue.next();
        System.out.print("Introduce el grupo de cotización del nuevo empleado: ");
        int GCot = inputValue.nextInt();
        System.out.print("Introduce el email del nuevo empleado: ");
        String email = inputValue.next();
        System.out.print("Introduce el id del departamento del nuevo empleado: ");
        int idDep = inputValue.nextInt();

        Employee empleoyee1 = new Employee(NIF, nombreEmpleado, apellido1Empleado, apellido2Empleado, cuentaEmpleado, antiguedad, nSS, catProf, GCot, email, idDep);
        empleoyee.add(empleoyee1);
        writeEmpleoyee.guardar();
    }

}
