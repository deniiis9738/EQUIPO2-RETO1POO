package Documents;

import PROYECTOANTIGUO.Empleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Read_csv implements Read_Write{

    protected static File miFichero;

    public static void leer() throws IOException {
        miFichero = new File("");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo líneas y mientras no llegue al final nos va mostrando su contenido
        }
    }

}
