package Modify.Delete;

import Contents.Department;
import Contents.Employee;
import Documents.Read_Department;
import Documents.Read_Empleoyee;
import Documents.Write_Department;
import Documents.Write_Empleoyee;

import java.io.IOException;
import java.util.Scanner;

public class DeleteDepartment extends Delete {

    public static Scanner inputValue = new Scanner(System.in);
    
    
    @Override
    public void realizeDelete() {

        try {
            borrarDepartamento();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void borrarDepartamento() throws IOException {
        Department departamentos2 = null;
        boolean tiene = true;
        boolean existe = false;
        boolean error = true;
        int eleccion = 0;

        while (error) {
            try {
                System.out.print("Introduce el departamento a borrar: ");
                eleccion = Integer.parseInt(inputValue.next());
                error = false;
            }catch (NumberFormatException e) {
                System.out.print("El departamento introducido no es válido, por favor introdúcelo de nuevo");
            }
        }//Como funcione me puedes ir cominedo los huevos , paso . NO LO HA BORRADO XD pq no has cerrado programa , vaya mierda ( carita triste jajajajajaajaj)
        for (Department departamentos1 : Read_Department.departments) {
            if (departamentos1.getIdDep() == eleccion) {
                existe = true;
                for (Employee employee1 : Read_Empleoyee.empleoyee) {
                    if (employee1.getIdDep() == departamentos1.getIdDep()) {
                        tiene = true;
                        break;
                    } else {
                        tiene = false;
                        departamentos2 = departamentos1;
                    }
                }
                break;
            }
            existe = false;
        }
        error = true;
        int aceptar = 0;
        if (existe) {
            if (tiene) {
                while (error) {
                    try {
                        System.out.println();
                        System.out.println("Este departamento contiene empleados, por lo que todos los empleados asociados se eliminarán.");
                        System.out.println("¿Está seguro que desea continuar?");
                        System.out.println("1.- Si");
                        System.out.println("2.- No");
                        aceptar = Integer.parseInt(inputValue.next());
                        System.out.println();
                        error = false;
                    } catch (NumberFormatException e) {
                        System.out.println("La respuesta elegida no es válida, por favor introdúcela de nuevo.");
                    }
                }
                for (int i = 0; i < Read_Department.departments.size(); i++) {
                    if (Read_Department.departments.get(i).getIdDep() == eleccion) {
                        if (aceptar == 1) {
                            for (int j = 0; j < Read_Empleoyee.empleoyee.size(); j++) {
                                if (Read_Empleoyee.empleoyee.get(j).getIdDep() == Read_Department.departments.get(i).getIdDep()) {
                                    Read_Empleoyee.empleoyee.remove(Read_Empleoyee.empleoyee.get(j));
                                    j--;
                                }
                            }
                            Read_Department.departments.remove(Read_Department.departments.get(i));
                            System.out.println("Departamento borrado correctamente");
                            break;
                        } else if (aceptar == 2) {
                            System.out.println("Borrado cancelado");
                        }
                    }
                }
            } else {
                Read_Department.departments.remove(departamentos2);
                System.out.println("Departamento borrado correctamente");
            }
            try {
                new Write_Department().guardar();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                new Write_Empleoyee().guardar();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("El departamento introducido no existe");
        }
    }



}
