package Modify.Add;

import Contents.Category;
import Documents.Read_Category;
import Documents.Write_Category;
import Documents.Write_Department;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

        Category category1 = new Category(id);

        Read_Category.categories.add(category1);
        System.out.println("Categoria añadida correctamente");
        System.out.println();
        System.out.println("Las categorias actuales son las siguientes: ");
        writeCategory.guardar();
    }

}

