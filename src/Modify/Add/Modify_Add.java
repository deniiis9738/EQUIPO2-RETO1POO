package Modify.Add;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Modify_Add {

    public abstract void realizeAdd();

    public static Scanner inputValue = new Scanner(System.in);
    public static File miFichero;

/*
    public static void guardarCategorias() {

        try {
            miFichero = new File("./src/Csv/CategoriasProfesionales.csv");
            if (!miFichero.exists()) {
                System.out.println("El fichero no existe");
            }
            edWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
            for (int i = 0; i < categorias.size(); i++) {
                flujoSalida.write(String.valueOf(categorias.get(i).getCategoria()));
                flujoSalida.write("\n");
            }
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void guardarEmpleados() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Empleados.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < empleados.size(); i++) {
            flujoSalida.write(empleados.get(i).getNIF());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getNombre());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getApellido1());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getApellido2());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getCuenta());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getAntiguedad());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getNASeguridadSocial());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getCatGProfesional());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(empleados.get(i).getGCotizacion()));
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getEmail());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(empleados.get(i).getIdDep()));
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }
*/


}
