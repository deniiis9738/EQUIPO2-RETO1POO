package Modify.Update;

import Contents.Employee;
import Documents.Read_Empleoyee;
import Documents.Write_Empleoyee;

import java.util.Scanner;

public class Update_employee_personal_data extends Update {

    Write_Empleoyee writeEmpleoyee = new Write_Empleoyee();
    @Override
    public void realizeUpdate() {
        try {
            modifyEmployee();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String id;
    public static int identificador;

    private static String askEmployee() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce el NIF del empleado a modificar: ");
        id = inputValue.next();
        return id;
    }

    private static void showEmployeeData(Employee employee1) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-10s%-28s%-25s%-20s%-15s\n",
                "NIF",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "Cuenta",
                "Antigüedad",
                "N. SS",
                "Categoria G.Profesional",
                "G.Cotización",
                "Email",
                "Id Departamento");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-19s%-24s%-12s%-35s%-15s\n",
                employee1.getNIF(),
                employee1.getNombre(),
                employee1.getApellido1(),
                employee1.getApellido2(),
                employee1.getCuenta(),
                employee1.getAntiguedad(),
                employee1.getNASeguridadSocial(),
                employee1.getCatGProfesional(),
                employee1.getGCotizacion(),
                employee1.getEmail(),
                employee1.getIdDep());

        System.out.println();
        System.out.println();
    }

    private static int askModifyData(Employee employee1) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Que datos deseas modificar?");
        System.out.println("1.- NIF");
        System.out.println("2.- Nombre");
        System.out.println("3.- Apellido1");
        System.out.println("4.- Apellido2");
        System.out.println("5.- Cuenta");
        System.out.println("6.- Antigüedad");
        System.out.println("7.- N. SS");
        System.out.println("8.- Categoría profesional");
        System.out.println("9.- Grupo Cotización");
        System.out.println("10.- Email");
        System.out.println("11.- Id del departamento");
        identificador = inputValue.nextInt();
        return identificador;
    }

    public static void modifyEmployee() {
        Scanner inputValue = new Scanner(System.in);
        String empleado = askEmployee();
        System.out.println();
        int i = -1;
        for (Employee employee1 : Read_Empleoyee.empleoyee) {
            i++;
            if (employee1.getNIF().equals(empleado)) {
                showEmployeeData(employee1);
                askModifyData(employee1);

                switch (identificador) {
                    case 1:
                        System.out.println("Introduce el nuevo NIF del empleado: ");
                        String NIF = inputValue.next();
                        employee1 = new Employee(NIF, employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 2:
                        System.out.println("Introduce el nuevo nombre del empleado: ");
                        String nombre = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), nombre, employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 3:
                        System.out.println("Introduce el nuevo apellido1 del empleado: ");
                        String apellido1 = inputValue.next();
                        employee1 = new Employee(employee1.getApellido1(), employee1.getNombre(), apellido1, employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 4:
                        System.out.println("Introduce el nuevo apellido2 del empleado: ");
                        String apellido2 = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), apellido2, employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 5:
                        System.out.println("Introduce la nueva cuenta del empleado: ");
                        String cuenta = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), cuenta,
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 6:
                        System.out.println("Introduce la anitgüedad del empleado: ");
                        String antiguedad = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                antiguedad, employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 7:
                        System.out.println("Introduce el nuevo n. SS del empleado: ");
                        String nSS = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), nSS, employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 8:
                        System.out.println("Introduce la nueva categoría progesional del empleado: ");
                        String catPro = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), catPro, employee1.getGCotizacion(), employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 9:
                        System.out.println("Introduce el nuevo grupo de cotización del empleado: ");
                        int gCot = inputValue.nextInt();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), gCot, employee1.getEmail(),
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 10:
                        System.out.println("Introduce el nuevo email del empleado: ");
                        String email = inputValue.next();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), email,
                                employee1.getIdDep());
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                    case 11:
                        System.out.println("Introduce el nuevo id del departamento del empleado: ");
                        int idDep = inputValue.nextInt();
                        employee1 = new Employee(employee1.getNIF(), employee1.getNombre(), employee1.getApellido1(), employee1.getApellido2(), employee1.getCuenta(),
                                employee1.getAntiguedad(), employee1.getNASeguridadSocial(), employee1.getCatGProfesional(), employee1.getGCotizacion(), employee1.getEmail(),
                                idDep);
                        Read_Empleoyee.empleoyee.set(i, employee1);
                        break;
                }
            }
        }
    }
}
