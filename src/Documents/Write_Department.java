package Documents;

import Contents.Department;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Write_Department extends Write_csv {

    public static ArrayList<Department> departments = new ArrayList<>();


    public static void guardar() throws IOException {

        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Csv/Departamentos.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }


        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < departments.size(); i++) {
            flujoSalida.write(String.valueOf(departments.get(i).getIdDep()));
            flujoSalida.write(";");
            flujoSalida.write(departments.get(i).getNombreDep());
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }
}