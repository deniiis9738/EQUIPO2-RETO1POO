package Modify.Add;

import Contents.Employee;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Add extends Modify_Add{

    public static Scanner inputValue = new Scanner(System.in);
    public static File miFichero;
    public static ArrayList<Employee> empleoyee = new ArrayList<>();

    @Override
    public void realizeAdd() {

    }
    /*

    public static void incorporarEmpleados() throws IOException {
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

        Empleoyee empleoyee1 = new Empleoyee(NIF, nombreEmpleado, apellido1Empleado, apellido2Empleado, cuentaEmpleado, antiguedad, nSS, catProf, GCot, email, idDep);
        empleoyee.add(empleoyee1);
    }


    public static void nuevaCategoriaProfesional() throws IOException {

        System.out.print("Introduce el id de la nueva categoria: ");
        String id = inputValue.next();

        Category category1 = new Category(id);
        categorias.add(category1);
        System.out.println("Categoria añadida correctamente");
        System.out.println();
        System.out.println("Las categorias actuales son las siguientes: ");
        for (Category catProfesionales1 : categorias) {
            System.out.println(catProfesionales1.getCategoria());
        }
        guardarCategorias();

    }

*/





}
