package Documents;

import PROYECTOANTIGUO.Horas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_Hours extends Read_csv{

    public static ArrayList<Horas> horas = new ArrayList<>();

    public static void leer() throws IOException {
        miFichero = new File("./src/Csv/Horas.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] horasArray = linea.split(";");
            horas.add(new Horas(horasArray[0], horasArray[1], Integer.parseInt(horasArray[2])));
            linea = flujoEntrada.readLine();
        }
    }
}
