package Modify.Delete;
import Documents.Read_Empleoyee;
import Documents.Write_Empleoyee;

import java.io.IOException;
import java.util.Scanner;

public class DeleteEmployee extends Delete{

    public static Scanner inputValue = new Scanner(System.in);


    @Override
    public void realizeDelete() {

        try {
            eliminarEmpleado();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void eliminarEmpleado() throws IOException {

        System.out.print("Introduce el NIF del empleado a eliminar: ");
        String NIF = inputValue.next();
        for (int i = 0; i < Read_Empleoyee.empleoyee.size(); i++) {
            if (Read_Empleoyee.empleoyee.get(i).getNIF() == NIF) {
                Read_Empleoyee.empleoyee.remove(i);
            }
        }
        try {
            new Write_Empleoyee().guardar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
