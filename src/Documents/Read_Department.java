package Documents;

import PROYECTOANTIGUO.Department;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_Department extends Read_csv{

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion lee el fichero que contiene los datos de los departamentos y los carga en memoria
     */

    public static ArrayList<Department> departments = new ArrayList<>();

    public static void leer() throws IOException {

        miFichero = new File("./src/Csv/Departamentos.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo líneas y mientras no llegue al final nos va mostrando su contenido
            String[] departamentoArray = linea.split(";");
            departments.add(new Department(Integer.parseInt(departamentoArray[0]), departamentoArray[1]));
            linea = flujoEntrada.readLine();
        }
    }
}