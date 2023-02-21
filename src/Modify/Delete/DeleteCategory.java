package Modify.Delete;
import Contents.Category;
import Contents.Employee;
import Documents.Read_Category;
import Documents.Read_Empleoyee;
import Documents.Write_Category;
import Documents.Write_Empleoyee;
import java.io.IOException;
import java.util.Scanner;

public class DeleteCategory extends Delete {

    public static Scanner inputValue = new Scanner(System.in);

    @Override
    public void realizeDelete() {

        try {
            borrarCategoriaProfesional();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void borrarCategoriaProfesional() throws IOException {
        Category category2 = null;
        boolean tiene = true;
        boolean existe = false;
        System.out.print("Introduce la categoría a borrar: ");
        String eleccion = inputValue.next().toUpperCase();
        for (Category category1 : Read_Category.categories) {
            if (category1.getCategoria().equals(eleccion)) {
                existe = true;
                for (Employee employee1 : Read_Empleoyee.empleoyee) {
                    if (employee1.getCatGProfesional().equals(category1.getCategoria())) {
                        tiene = true;
                        break;
                    } else {
                        tiene = false;
                        category2 = category1;
                    }
                }
                break;
            }
            existe = false;
        }

        if (existe) {
            if (tiene) {
                System.out.println("Esta categoría contiene empleados, por lo que todos los empleados asocaidos a ella se eliminarán.");
                System.out.println("¿Está seguro que desea continuar?");
                System.out.println("1.- Si");
                System.out.println("2.- No");
                int aceptar = inputValue.nextInt();
                for (int i = 0; i < Read_Category.categories.size(); i++) {
                    if (Read_Category.categories.get(i).getCategoria().equals(eleccion)) {
                        if (aceptar == 1) {
                            for (int j = 0; j < Read_Empleoyee.empleoyee.size(); j++) {
                                if (Read_Empleoyee.empleoyee.get(j).getCatGProfesional().equals(Read_Category.categories.get(i).getCategoria())) {
                                    Read_Empleoyee.empleoyee.remove(Read_Empleoyee.empleoyee.get(j));
                                    j--;
                                }
                            }
                            Read_Category.categories.remove(Read_Category.categories.get(i));
                            System.out.println("Categoría borrada correctamente");
                            break;
                        } else if (aceptar == 2) {
                            System.out.println("Borrado cancelado");
                        }
                    }
                }
            } else {
                Read_Category.categories.remove(category2);
                System.out.println("Categoría borrada correctamente");
            }
            try {
                new Write_Category().guardar();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                new Write_Empleoyee().guardar();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("La categoría introducida no existe");
        }
    }




}
