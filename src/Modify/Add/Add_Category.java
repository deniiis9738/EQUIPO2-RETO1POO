package Modify.Add;

import Contents.Category;
import static Documents.Read_Category.categories;

import Documents.Read_Category;
import Documents.Write_Category;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Carlos Hernandez Garcia
 * @version V2
 * Esta clase añade una nueva categoria a la lista de categorias
 */
public class Add_Category extends Add {

    Write_Category writeCategory = new Write_Category();

    @Override
    public void realizeAdd() {
        try {
            newProfesionalCategory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void newProfesionalCategory() throws IOException {


        Scanner inputValue = new Scanner(System.in);
        System.out.print("Introduce el id de la nueva categoria: ");
        String id = inputValue.next();
        System.out.println("Categoria añadida correctamente");
        System.out.println();
        Category category1 = new Category(id);
        categories.add(category1);
        writeCategory.save();
    }

}

