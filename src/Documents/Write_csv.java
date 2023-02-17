package Documents;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Write_csv implements Read_Write {

    protected static File miFichero;
    public static void guardar() throws IOException {
        miFichero = new File("");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
    }

}
