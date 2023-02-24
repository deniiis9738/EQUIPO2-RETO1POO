package Documents;

import Contents.Cotization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Carlos Hernandez Garcia
 * @version V2
 * Esta clase lee el fichero Cotizacion.csv y lo guarda en un ArrayList
 */
public class Read_Cotization extends Read_csv{
    public static ArrayList<Cotization> cotization = new ArrayList<>();


    @Override
    public void read() throws IOException {
        miFichero = new File("./src/Csv/Cotizacion.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] salarioArray = linea.split(";");
            cotization.add(new Cotization(Integer.parseInt(salarioArray[0]), Integer.parseInt(salarioArray[1])));
            linea = flujoEntrada.readLine();
        }
    }
}
