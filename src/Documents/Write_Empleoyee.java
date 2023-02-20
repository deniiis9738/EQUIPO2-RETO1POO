package Documents;

import Contents.Employee;

import java.io.*;
import java.util.ArrayList;

public class Write_Empleoyee extends Write_csv {

    public static ArrayList<Employee> empleoyee = new ArrayList<>();

    public static void guardar() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Csv/Empleados.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < empleoyee.size(); i++) {
            flujoSalida.write(empleoyee.get(i).getNIF());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getNombre());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getApellido1());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getApellido2());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getCuenta());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getAntiguedad());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getNASeguridadSocial());
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getCatGProfesional());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(empleoyee.get(i).getGCotizacion()));
            flujoSalida.write(";");
            flujoSalida.write(empleoyee.get(i).getEmail());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(empleoyee.get(i).getIdDep()));
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }

}
