package Documents;

import Contents.Category;

import java.io.*;
import java.util.ArrayList;

public class Write_Category extends Write_csv{


    @Override
    public void save() throws IOException {

        miFichero = new File("./src/Csv/CategoriasProfesionales.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }

        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < Read_Category.categories.size(); i++) {
            flujoSalida.write(Read_Category.categories.get(i).getCategoria());
            flujoSalida.write("\n");
        }

        flujoSalida.close();

    }

}
