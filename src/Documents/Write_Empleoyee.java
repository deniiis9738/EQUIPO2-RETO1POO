package Documents;

import Contents.Employee;

import java.io.*;
import java.util.ArrayList;
/**
 * @author Iker Rodriguez Montava
 * @version v2
 * @throws IOException
 * Esta clase guarda los empleados
 */

public class Write_Empleoyee extends Write_csv {


    @Override
    public void save() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Csv/Empleados.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < Read_Empleoyee.empleoyee.size(); i++) {
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getNIF());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getNombre());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getApellido1());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getApellido2());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getCuenta());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getAntiguedad());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getNASeguridadSocial());
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getCatGProfesional());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(Read_Empleoyee.empleoyee.get(i).getGCotizacion()));
            flujoSalida.write(";");
            flujoSalida.write(Read_Empleoyee.empleoyee.get(i).getEmail());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(Read_Empleoyee.empleoyee.get(i).getIdDep()));
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }

}
