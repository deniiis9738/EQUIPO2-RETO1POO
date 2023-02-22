
import Documents.*;
import Inquiries.*;
import Modify.Add.Add_Category;
import Modify.Add.Add_Employee;
import Modify.Delete.DeleteCategory;
import Modify.Delete.DeleteDepartment;
import Modify.Update.Update_employee_personal_data;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static final int CERRAR_PROGRAMA = 0;
    public static final int EXPORTAR_CSV = 1;
    public static final int CONSULTAR = 2;
    public static final int INCORPORAR = 3;
    public static final int MODIFICAR_DATOSPERSONALES = 4;
    public static final int ELIMINAR = 5;
    public static final int CONSULTAR_DATOS_EMPLEADO = 1;
    public static final int CONSULTAR_EMPLEADOS_GCOTIZACION = 2;
    public static final int CONSULTAR_EMPLEADOS_DEPARTAMENTO = 3;
    public static final int CONSULTAR_CANTIDADEMPLEADOS_DEPARTAMENTO = 4;
    public static final int CONSULTAR_SALARIO_EMPRESA = 5;
    public static final int CONSULTAR_SALARIO_GCOT = 6;
    public static final int CONSULTAR_HORASEXTRAS_DEPARTAMENTO = 7;
    public static final int CONSULTAR_SALARIO_DEPARTAMENTO = 8;
    public static final int INCORPORAR_NUEVOTRABAJDOR = 1;
    public static final int INCORPORAR_NUEVACATEGORIA = 2;
    public static final int ELIMINAR_DEPARTAMENTOS = 1;
    public static final int ELIMINAR_DATOSCATEGORIA = 2;
    public static int opcion;
    public static Scanner inputValue = new Scanner(System.in);

    private static Write_Empleoyee write_empleoyee = new Write_Empleoyee();
    private static Write_Department write_department = new Write_Department();
    private static Write_Category write_category = new Write_Category();
    private static Write_Hours write_hours = new Write_Hours();
    private static Write_Cotization write_cotization = new Write_Cotization();

    private static Read_Empleoyee read_empleoyee = new Read_Empleoyee();
    private static Read_Department read_department = new Read_Department();
    private static Read_Category read_category = new Read_Category();
    private static Read_Cotization read_cotization = new Read_Cotization();
    private static Read_Hours read_hours = new Read_Hours();


    private static DeleteDepartment deleteDepartment = new DeleteDepartment();
    private static DeleteCategory deleteCategory = new DeleteCategory();

    private static Add_Category add_category = new Add_Category();
    private static Add_Employee add_employee = new Add_Employee();

    private static Update_employee_personal_data update_employee_personal_data = new Update_employee_personal_data();

    private static InquirieCountEmployee_Department inquirieCountEmployee_department = new InquirieCountEmployee_Department();
    private static InquirieSalaryDepartment inquirieSalaryDepartment = new InquirieSalaryDepartment();
    private static InquirieSalaryCompany inquirieSalaryCompany = new InquirieSalaryCompany();
    private static InquirieHoursDepartment inquirieHoursDepartment = new InquirieHoursDepartment();
    private static InquirieEmployee inquirieEmployee = new InquirieEmployee();
    private static InquirieEmployee_Category inquirieEmployee_category = new InquirieEmployee_Category();
    private static InquirieEmployee_idDepartment inquirieEmployee_idDepartment = new InquirieEmployee_idDepartment();
    private static InquirieEmployee_GCotization inquirieEmployee_gCotization = new InquirieEmployee_GCotization();
    private static InquirieSalary_GCotization inquirieSalary_gCotization = new InquirieSalary_GCotization();

    public static void Menu () {
        boolean error = true;
        while (error) {
            try {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu principal, elija una de las siguientes opciones:");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("0.- Salir");
                System.out.println("1.- Guardar archivos ");
                System.out.println("2.- Consultar datos ");
                System.out.println("3.- Incorporar datos ");
                System.out.println("4.- Modificar datos personales ");
                System.out.println("5.- Eliminar datos ");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Introduce una opcion: ");
                opcion = Integer.parseInt(inputValue.next());
                System.out.println();
                error = false;
            }catch (NumberFormatException e) {
                System.out.print("La opcion no es valida , por favor introdúcela de nuevo: ");
            }
        }

    }

    /**
     * @author: Iker Rodriguez Montava
     * @collaborator: Carlos Hernandez Garcia
     * Submenu para la consulta de datos
     */

    public static void consultar () {
        boolean error = true;
        while (error) {
            try {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu para la consulta de datos");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Opciones: ");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("1.- Consultar datos empleado");
                System.out.println("2.- Consultar trabajadores por grupo cotizacion ");
                System.out.println("3.- Consultar trabajadores por departamento ");
                System.out.println("4.- Consultar cantidad de empleados por departamento");
                System.out.println("5.- Consultar coste salarial de la empresa");
                System.out.println("6.- Consultar coste salarial por categoria profesional ");
                System.out.println("7.- Consultar cantidad de horas extras por departamento ");
                System.out.println("8.- Consultar coste salarial de un departamento");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Introduce una opcion: ");
                opcion = Integer.parseInt(inputValue.next());
                System.out.println();
                error = false;
            }catch (NumberFormatException e) {
                System.out.print("La opcion no es valida , por favor introdúcela de nuevo: ");
            }
        }

    }

    /**
     * @author: Iker Rodriguez Montava
     * @collaborator: Carlos Hernandez Garcia
     * Submenu para la incorporacion de datos
     */

    public static void incorporar () {
        boolean error = true;
        while (error) {
            try {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu para la incorporación de datos");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Opciones: ");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("1.- Incorporar nuevo trabajador ");
                System.out.println("2.- Incorporar nueva categoria ");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Introduce una opcion: ");
                opcion = Integer.parseInt(inputValue.next());
                System.out.println();
                error = false;
            }catch (NumberFormatException e) {
                System.out.print("La opcion no es valida , por favor introdúcela de nuevo: ");
            }
        }

    }
    /**
     * @author: Iker Rodriguez Montava
     * @collaborator: Carlos Hernandez Garcia
     * Submenu para la eliminacion de datos
     */

    public static void eliminar () {
        boolean error = true;
        while (error) {
            try {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu para la eliminacion de datos");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Opciones: ");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("1.- Eliminar departamentos ");
                System.out.println("2.- Eliminar datos categoria ");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.print("Introduce una opcion: ");
                opcion = Integer.parseInt(inputValue.next());
                System.out.println();
                error = false;
            }catch (NumberFormatException e) {
                System.out.print("La opcion no es valida , por favor introdúcela de nuevo: ");
            }
        }

    }

    /**
     * @author: Iker Rodriguez Montava
     * Lugar donde se reunen todas las funciones para que el usuario pueda elegir que desea hacer.
     */

    public static void saveAll() throws IOException {
        write_empleoyee.save();
        write_department.save();
        write_hours.save();
        write_category.save();
        write_cotization.save();
    }


    public static void main (String[]args)  throws IOException {

        boolean error = true;
        while (error) {
            try {
                read_category.read();
                read_cotization.read();
                read_department.read();
                read_hours.read();
                read_empleoyee.read();
                boolean programa = true;

                do {
                    Menu();
                    switch (opcion) {

                        case CERRAR_PROGRAMA:
                            programa = false;
                            System.out.println("Gracias por usar nuestro sistema.");

                            break;
                        case EXPORTAR_CSV:
                            saveAll();
                            System.out.println("Todos los archivos se han guardado correctamente");
                            break;
                        case CONSULTAR:
                            consultar();
                            switch (opcion) {
                                case CONSULTAR_DATOS_EMPLEADO:
                                    inquirieEmployee.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_EMPLEADOS_GCOTIZACION:
                                     inquirieEmployee_gCotization.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_EMPLEADOS_DEPARTAMENTO:
                                    inquirieEmployee_idDepartment.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_CANTIDADEMPLEADOS_DEPARTAMENTO:
                                    inquirieCountEmployee_department.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_SALARIO_EMPRESA:
                                    inquirieSalaryCompany.realizeInquirie();
                                    inquirieEmployee_gCotization.realizeInquirie();
                                    inquirieSalaryCompany.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_SALARIO_GCOT:
                                    inquirieEmployee_gCotization.realizeInquirie();
                                    inquirieSalary_gCotization.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_HORASEXTRAS_DEPARTAMENTO:
                                    inquirieHoursDepartment.realizeInquirie();
                                    System.out.println();
                                    break;
                                case CONSULTAR_SALARIO_DEPARTAMENTO:
                                    inquirieEmployee_gCotization.realizeInquirie();
                                    inquirieSalaryDepartment.realizeInquirie();
                                    System.out.println();
                                    break;
                            }
                            break;

                        case INCORPORAR:
                            incorporar();
                            switch (opcion) {
                                case INCORPORAR_NUEVOTRABAJDOR:
                                    add_employee.realizeAdd();
                                    write_empleoyee.save();
                                    break;
                                case INCORPORAR_NUEVACATEGORIA:
                                    add_category.realizeAdd();
                                    break;
                            }
                            break;
                        case MODIFICAR_DATOSPERSONALES:
                            update_employee_personal_data.realizeUpdate();
                            write_empleoyee.save();
                            break;

                        case ELIMINAR:
                            eliminar();
                            switch (opcion) {
                                case ELIMINAR_DEPARTAMENTOS:
                                    deleteDepartment.realizeDelete();
                                    break;
                                case ELIMINAR_DATOSCATEGORIA:
                                    deleteCategory.realizeDelete();
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Opción incorrecta, introdúcela de nuevo.");
                            System.out.println();
                    }
                } while (programa);
                opcion = Integer.parseInt(inputValue.next());
                System.out.println();
                error = false;
            }catch (NumberFormatException e) {
                System.out.print("La opcion no es valida , por favor introdúcela de nuevo: ");
            }
        }
    }
}