package Documents;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Write_csv {

    protected static File miFichero;
    public abstract void guardar() throws IOException;

}
