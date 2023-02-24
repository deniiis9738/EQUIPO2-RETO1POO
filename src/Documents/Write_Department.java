package Documents;

import Contents.Department;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Iker Rodriguez Montava
 * @version v2
 * @throws IOException
 * Esta clase guarda los departamentos
 */

public class Write_Department extends Write_csv {

    @Override
    public  void save() throws IOException {

        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Csv/Departamentos.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }


        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < Read_Department.departments.size(); i++) {
            flujoSalida.write(String.valueOf(Read_Department.departments.get(i).getIdDep()));
            flujoSalida.write(";");
            flujoSalida.write(Read_Department.departments.get(i).getNombreDep());
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }
}