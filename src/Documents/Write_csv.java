package Documents;

import java.io.File;
import java.io.IOException;
/**
 * @author Iker Rodriguez Montava
 * @version v2
 * @throws IOException
 * Esta clase contiene la clase abstracta que utilizaremos para las demas clases
 */
public abstract class Write_csv {

    protected static File miFichero;
    public abstract void save() throws IOException;

}
