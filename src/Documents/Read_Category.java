package Documents;

import Contents.Category;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_Category extends Read_csv{
    public static ArrayList<Category> categories = new ArrayList<>();


@Override
    public  void leer() throws IOException {

        miFichero = new File("./src/Csv/CategoriasProfesionales.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] categoriaArray = linea.split(";");
            categories.add(new Category(categoriaArray[0]));
            linea = flujoEntrada.readLine();
        }
    }
}
