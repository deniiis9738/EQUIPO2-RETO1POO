package Documents;

import java.io.File;
import java.io.IOException;

/**
 * @author Carlos Hernandez Garcia
 * @version V2
 * Esta clase es la clase padre de las clases que leen los ficheros
 */
public abstract class Read_csv {

    protected static File miFichero;

    public abstract void read() throws IOException;

}
