package Documents;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class Read_csv {

    protected static File miFichero;

    public abstract void leer() throws IOException;

}
