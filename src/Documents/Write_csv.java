package Documents;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Write_csv implements Read_Write {

    protected static File miFichero;
    public abstract void guardar() throws IOException;

}
