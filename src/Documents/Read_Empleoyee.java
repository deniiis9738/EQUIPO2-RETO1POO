package Documents;

import Contents.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Carlos Hernandez Garcia
 * @version V2
 * Esta clase lee el fichero Empleados.csv y lo guarda en un ArrayList
 */
public class Read_Empleoyee extends Read_csv{

    public static ArrayList<Employee> empleoyee = new ArrayList<>();
    @Override
    public void read() throws IOException {
        miFichero = new File("./src/Csv/Empleados.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] empleadoArray = linea.split(";");
            empleoyee.add(new Employee(empleadoArray[0], empleadoArray[1], empleadoArray[2], empleadoArray[3], empleadoArray[4], empleadoArray[5], empleadoArray[6], empleadoArray[7], Integer.parseInt(empleadoArray[8]), empleadoArray[9], Integer.parseInt(empleadoArray[10])));
            linea = flujoEntrada.readLine();
        }
    }



}
