package PROYECTOANTIGUO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Reto1 {

    /**
     * @author: Grupo 2
     * @collaborator: Carlos Hernandez Garcia
     * @collaborator: Iker Rodriguez Montava
     * @collaborator: Denis Andres Ion Badea
     * Este programa es utilizado para la gestion de usuarios de los departamentos correspondientes a una empresa
     * El programa nos permite:
     * Consultar cualquier dato de un trabajador o departamento.
     * Incorporar nuevos trabajadores y categorias.
     * Eliminar departamento y datos de categorias
     * Modificar Datos Personales
     * Mostrando los resultados a traves de la terminal
     */
    public static final int CERRAR_PROGRAMA = 0;
    public static final int EXPORTAR_CSV = 1;
    public static final int CONSULTAR = 2;
    public static final int INCORPORAR = 3;
    public static final int MODIFICAR_DATOSPERSONALES = 4;
    public static final int ELIMINAR = 5;
    public static String ENTER = "";
    public static final int CONSULTAR_DATOS_EMPLEADO = 1;
    public static final int CONSULTAR_EMPLEADOS_GCOTIZACION = 2;
    public static final int CONSULTAR_EMPLEADOS_DEPARTAMENTO = 3;
    public static final int CONSULTAR_CANTIDADEMPLEADOS_DEPARTAMENTO = 4;
    public static final int CONSULTAR_SALARIO_EMPRESA = 5;
    public static final int CONSULTAR_SALARIO_GCOT = 6;
    public static final int CONSULTAR_HORASEXTRAS_DEPARTAMENTO = 7;
    public static final int CONSULTAR_SALARIO_DEPARTAMENTO = 8;
    public static final int INCORPORAR_NUEVOTRABAJDOR = 1;
    public static final int INCORPORAR_NUEVACATEGORIA = 2;
    public static final int ELIMINAR_DEPARTAMENTOS = 1;
    public static final int ELIMINAR_DATOSCATEGORIA = 2;
    public static int identificador;
    public static String id;
    public static int opcion;
    public static ArrayList<Empleoyee> empleados = new ArrayList<>();
    public static ArrayList<Empleoyee> auxE = new ArrayList<>();
    public static ArrayList<Hours> horas = new ArrayList<>();
    public static ArrayList<Cotization> cotizations = new ArrayList<>();
    public static ArrayList<Category> categorias = new ArrayList<>();
    public static int[] cantECod = new int[7];
    public static int[] cantE = new int[29];
    public static int[] cantG = new int[7];
    public static ArrayList<Department> departamentos = new ArrayList<>();
    public static Scanner inputValue = new Scanner(System.in);
    public static File miFichero;
    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * @collaborator: Denis Andres Ion Badea
     * @collaborator: Iker Rodrigez Montava
     * La funcion llama a las distintas funciones que se encargan de leer los ficheros
     * y de cargar los datos en memoria
     */
    public static void leerArchivos() throws IOException {

        leerEmpleados();
        leerDepartamentos();
        leerCotizacion();
        leerHoras();
        leerCategorias();
    }

    /**
     * @throws IOException
     * @author: Denis Andres Ion Badea
     * La funcion lee el fichero que contiene los datos de los empleados y los carga en memoria
     */
    public static void leerEmpleados() throws IOException {
        miFichero = new File("./src/Empleados.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] empleadoArray = linea.split(";");
            empleados.add(new Empleoyee(empleadoArray[0], empleadoArray[1], empleadoArray[2], empleadoArray[3], empleadoArray[4], empleadoArray[5], empleadoArray[6], empleadoArray[7], Integer.parseInt(empleadoArray[8]), empleadoArray[9], Integer.parseInt(empleadoArray[10])));
            linea = flujoEntrada.readLine();
        }
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion lee el fichero que contiene los datos de los departamentos y los carga en memoria
     */
    public static void leerDepartamentos() throws IOException {

        miFichero = new File("./src/Departamentos.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] departamentoArray = linea.split(";");
            departamentos.add(new Department(Integer.parseInt(departamentoArray[0]), departamentoArray[1]));
            linea = flujoEntrada.readLine();
        }
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion lee el fichero que contiene los datos de las categorias y los carga en memoria
     */

    public static void leerCategorias() throws IOException {

        miFichero = new File("./src/CategoriasProfesionales.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] categoriaArray = linea.split(";");
            categorias.add(new Category(categoriaArray[0]));
            linea = flujoEntrada.readLine();
        }
    }

    /**
     * @throws IOException
     * @author: Iker Rodrigez Montava
     * La Funcion consulta los datos de un empleado a partir del NIFR
     */

    public static void consultarEmpleado() {

        menuConsultarEmpleado();


        for (Empleoyee empleoyee1 : empleados) {

            if (empleoyee1.getNIF().equals(id)) {

                printeoConsultarEmpleados(empleoyee1);

            }
        }

    }

    /**
     * El metodo printea la busqueda de consultarEmpleado()
     * @param empleoyee1
     */
    private static void printeoConsultarEmpleados(Empleoyee empleoyee1) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-19s%-24s%-17s%-15s\n",
                empleoyee1.getNIF(),
                empleoyee1.getNombre(),
                empleoyee1.getApellido1(),
                empleoyee1.getApellido2(),
                empleoyee1.getCuenta(),
                empleoyee1.getAntiguedad(),
                empleoyee1.getNASeguridadSocial(),
                empleoyee1.getCatGProfesional(),
                empleoyee1.getGCotizacion(),
                empleoyee1.getIdDep());
    }

    /**
     * El metodo pregunta por el id y devuelve dicho id a la funcion
     * @return devuelve el NIF del empleado que vamos a consultar
     */
    private static String menuConsultarEmpleado() {
        System.out.print("Introduce el NIF del empleado: ");
        id = inputValue.next();

        System.out.println();

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-10s%-28s%-15s%-15s\n",
                "NIF",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "Cuenta",
                "Antigüedad",
                "N. SS",
                "Categoria G.Profesional",
                "G.Cotización",
                "Id Departamento");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        return id;
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * @collaborator: Denis Andres Ion Badea
     * La funcion consulta los empleados de un departamento a partir del id del departamento
     */

    public static void consultarEmpleadosDepartamentos() throws IOException {

        menuConsultarDepartamentos();

        for (Empleoyee empleoyee1 : empleados) {

            if (empleoyee1.getIdDep() == identificador) {

                printeoEmpleadosDepartamentos(empleoyee1);

            }
        }
        System.out.println();
    }

    /**
     * EL metodo printea la informacion de consultarEmpleadosDepartamentos()
     * @param empleoyee1
     */
    private static void printeoEmpleadosDepartamentos(Empleoyee empleoyee1) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-19s%-24s%-17s%-15s\n",
                empleoyee1.getNIF(),
                empleoyee1.getNombre(),
                empleoyee1.getApellido1(),
                empleoyee1.getApellido2(),
                empleoyee1.getCuenta(),
                empleoyee1.getAntiguedad(),
                empleoyee1.getNASeguridadSocial(),
                empleoyee1.getCatGProfesional(),
                empleoyee1.getGCotizacion(),
                empleoyee1.getIdDep());
    }

    /**
     * Este metodo pide un identificador del grupo y devuelve dicho indicador al la funcion que lo usa
     * @return un int que sirve como identificador del departamento
     */
    private static int menuConsultarDepartamentos() {
        System.out.print("Introduce el ID del departamento: ");
        identificador = inputValue.nextInt();
        System.out.println();

        System.out.println("Nombre departamento");

        for (Department department1 : departamentos) {
            if (department1.getIdDep() == identificador) {
                System.out.println(department1.getNombreDep());
            }
        }
        System.out.println();
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-10s%-28s%-15s%-15s\n",
                "NIF",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "Cuenta",
                "Antigüedad",
                "N. SS",
                "Categoria G.Profesional",
                "G.Cotización",
                "Id Departamento");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        return identificador;
    }

    /**
     * @author: Iker Rodrigez Montava
     * La funcion dice la cantidad de empleados que hay en un departamento
     */

    public static void consultarCantidadEmpleados() {

        System.out.printf("%-15s%-15s\n",
                "Departamento",
                "Cantidad");

        int contador = 0;

        for (Department department1 : departamentos) {

            for (Empleoyee empleoyee1 : empleados) {

                int idEmpleado = empleoyee1.getIdDep();
                int idDepartamento = department1.getIdDep();

                if (idEmpleado == idDepartamento) {
                    contador++;

                }


            }

            System.out.printf("%-15s%-15s\n",
                    department1.getNombreDep(),
                    contador);

            contador = 0;
        }
    }

    /**
     * @author: Iker Rodrigez Montava
     * La funcion cuenta la cantidad de empleados que hay en cada grupo de cotizacion y los guarda en un array
     * Esta funcion es utlizada por otras para completar su funcinamiento
     */

    public static void consultarEmpleadosGrupoCotizacion() {

        int contador = 0;
        int i = -1;

        for (Cotization cotization1 : cotizations) {
            i++;
            for (Empleoyee empleoyee1 : empleados) {

                int Gcotizacion = empleoyee1.getGCotizacion();
                int NGCotizacion = cotization1.getGCot();

                if (Gcotizacion == NGCotizacion) {
                    contador++;
                }
                cantECod[i] = contador;
            }
            contador = 0;
        }
    }

    /**
     * @throws IOException
     * @author: Denis Andres Ion Badea
     * La funcion consulta los trabajadores que hay en cada grupo de cotizacion y lo imprime por pantalla
     */

    public static void consultarEmpleadosCotizacion() throws IOException {

        try {
            System.out.print("Introduce grupo de cotización: ");
            identificador = Integer.parseInt(inputValue.next());
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("El grupo de cotización introducido no es válido, por favor introdúcela de nuevo");
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-10s%-28s%-15s%-15s\n",
                "NIF",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "Cuenta",
                "Antigüedad",
                "N. SS",
                "Categoria G.Profesional",
                "G.Cotización",
                "Id Departamento");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        for (Empleoyee empleoyee1 : empleados) {

            if (empleoyee1.getGCotizacion() == identificador) {

                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-19s%-24s%-17s%-15s\n",
                        empleoyee1.getNIF(),
                        empleoyee1.getNombre(),
                        empleoyee1.getApellido1(),
                        empleoyee1.getApellido2(),
                        empleoyee1.getCuenta(),
                        empleoyee1.getAntiguedad(),
                        empleoyee1.getNASeguridadSocial(),
                        empleoyee1.getCatGProfesional(),
                        empleoyee1.getGCotizacion(),
                        empleoyee1.getIdDep());

            }
        }
        System.out.println();
    }

    /**
     * @author: Carlos Hernandez Garci
     * Método que permite incorporar a un nuevo empleado en la lista de empleados.
     * @throws IOException Si ocurre algún problema de entrada/salida durante la ejecución del método
     */

    public static void incorporarEmpleados() throws IOException {
        String antiguedad = "";
        System.out.print("Introduce el NIF del nuevo empleado: ");
        String NIF = inputValue.next();
        System.out.print("Introduce el Nombre del nuevo empleado: ");
        String nombreEmpleado = inputValue.next();
        System.out.print("Introduce el Apellido1 del nuevo empleado: ");
        String apellido1Empleado = inputValue.next();
        System.out.print("Introduce el Apellido2 del nuevo empleado: ");
        String apellido2Empleado = inputValue.next();
        System.out.print("Introduce la cuenta de usuario del nuevo empleado: ");
        String cuentaEmpleado = inputValue.next();
        System.out.print("Introduce el número de seguridad social del nuevo empleado: ");
        String nSS = inputValue.next();
        System.out.print("Introduce la categoría profesional del nuevo empleado: ");
        String catProf = inputValue.next();
        System.out.print("Introduce el grupo de cotización del nuevo empleado: ");
        int GCot = inputValue.nextInt();
        System.out.print("Introduce el email del nuevo empleado: ");
        String email = inputValue.next();
        System.out.print("Introduce el id del departamento del nuevo empleado: ");
        int idDep = inputValue.nextInt();

        Empleoyee empleoyee1 = new Empleoyee(NIF, nombreEmpleado, apellido1Empleado, apellido2Empleado, cuentaEmpleado, antiguedad, nSS, catProf, GCot, email, idDep);
        empleados.add(empleoyee1);
    }





    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion permite guardar los datos de los empleados en un fichero csv
     */

    public static void guardarEmpleados() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Empleados.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < empleados.size(); i++) {
            flujoSalida.write(empleados.get(i).getNIF());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getNombre());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getApellido1());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getApellido2());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getCuenta());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getAntiguedad());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getNASeguridadSocial());
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getCatGProfesional());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(empleados.get(i).getGCotizacion()));
            flujoSalida.write(";");
            flujoSalida.write(empleados.get(i).getEmail());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(empleados.get(i).getIdDep()));
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion permite guardar los datos de los departamentos en un fichero csv
     */

    public static void guardarDepartamentos() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Departamentos.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < departamentos.size(); i++) {
            flujoSalida.write(String.valueOf(departamentos.get(i).getIdDep()));
            flujoSalida.write(";");
            flujoSalida.write(departamentos.get(i).getNombreDep());
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }

    /**
     * @throws IOException
     * @author: Denis Andres Ion Badea
     * @collaborator: Carlos Hernandez Garcia
     * @collaborator: Iker Rodriguez Montava
     * La funcion permite guardar los datos de los grupos de cotizacion en un fichero csv
     */

    public static void guardarCotizacion() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Cotizacion.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < cotizations.size(); i++) {
            flujoSalida.write(String.valueOf(cotizations.get(i).getGCot()));
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(cotizations.get(i).getDinero()));
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }

    /**
     * @throws IOException
     * @author: Denis Andres Ion Badea
     * @collaborator: Carlos Hernandez Garcia
     * @collaborator: Iker Rodriguez Montava
     * La funcion permite guardar las horas extra en un fichero csv
     * Sobreescribe el dichero de horas con los datos actualizados
     * En caso de no encontrar el fichero indicado muestra por pantalla el error
     */

    public static void guardarHoras() throws IOException {
        //Funcion para guardar los datos en el archivo csv

        miFichero = new File("./src/Horas.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
        for (int i = 0; i < horas.size(); i++) {
            flujoSalida.write(horas.get(i).getNIF());
            flujoSalida.write(";");
            flujoSalida.write(horas.get(i).getFecha());
            flujoSalida.write(";");
            flujoSalida.write(String.valueOf(horas.get(i).getHoras()));
            flujoSalida.write("\n");
        }
        flujoSalida.close();
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * @collaborator: Denis Andres Ion Badea
     * @collaborator: Iker Rodriguez Montava
     * La funcion junta las diferentes funciones que guardan archivos
     */

    public static void guardarTodo() throws IOException {
        guardarEmpleados();
        guardarDepartamentos();
        guardarCotizacion();
        guardarHoras();
        guardarCategorias();
    }

    /**
     * @throws IOException
     * @author: Ikerr Rodriguez Montava
     * @collaborator: Denis Andres Ion Badea
     * La funcion permite consultar el coste salarial que tiene  cada departamento
     */
    public static void consultarCosteSalDep() {

        System.out.print("Introduce el id del departamento: ");
        int idDep = inputValue.nextInt();
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getIdDep() == idDep) {
                System.out.println("El coste salarial del departamento " + idDep + " es de " + empleados.get(i).getGCotizacion());
            }
        }
    }

    /**
     * La función modificarDatos permite a un usuario modificar los datos de un empleado.
     * El usuario debe introducir el NIF del empleado que desea modificar y a continuación se le preguntará
     * qué campo desea modificar. Una vez seleccionado, se le pedirá que introduzca el nuevo valor para ese campo.
     * Los campos que se pueden modificar son: NIF, nombre, primer apellido, segundo apellido, cuenta bancaria,
     * antigüedad, número de seguridad social, categoría profesional, cotización a la seguridad social,
     * correo electrónico e identificador del departamentSo.
     * @author: Denis Andres Ion Badea y Carlos Hernandez Garcia
     */

    public static void modificarDatos() {
        String empleado = preguntarEmpleadoModifcar();

        System.out.println();
        int i = -1;
        for (Empleoyee empleoyee1 : empleados) {
            i++;
            if (empleoyee1.getNIF().equals(empleado)) {
                mostrarDatosEmpleado(empleoyee1);
                preguntaModificaDatos(empleoyee1);

                switch (identificador) {
                    case 1:
                        System.out.println("Introduce el nuevo NIF del empleado: ");
                        String NIF = inputValue.next();
                        empleoyee1 = new Empleoyee(NIF, empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 2:
                        System.out.println("Introduce el nuevo nombre del empleado: ");
                        String nombre = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), nombre, empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 3:
                        System.out.println("Introduce el nuevo apellido1 del empleado: ");
                        String apellido1 = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getApellido1(), empleoyee1.getNombre(), apellido1, empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 4:
                        System.out.println("Introduce el nuevo apellido2 del empleado: ");
                        String apellido2 = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), apellido2, empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 5:
                        System.out.println("Introduce la nueva cuenta del empleado: ");
                        String cuenta = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), cuenta,
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 6:
                        System.out.println("Introduce la anitgüedad del empleado: ");
                        String antiguedad = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                antiguedad, empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 7:
                        System.out.println("Introduce el nuevo n. SS del empleado: ");
                        String nSS = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), nSS, empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 8:
                        System.out.println("Introduce la nueva categoría progesional del empleado: ");
                        String catPro = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), catPro, empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 9:
                        System.out.println("Introduce el nuevo grupo de cotización del empleado: ");
                        int gCot = inputValue.nextInt();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), gCot, empleoyee1.getEmail(),
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 10:
                        System.out.println("Introduce el nuevo email del empleado: ");
                        String email = inputValue.next();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), email,
                                empleoyee1.getIdDep());
                        empleados.set(i, empleoyee1);
                        break;
                    case 11:
                        System.out.println("Introduce el nuevo id del departamento del empleado: ");
                        int idDep = inputValue.nextInt();
                        empleoyee1 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                                empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(),
                                idDep);
                        empleados.set(i, empleoyee1);
                        break;
                }
            }
        }
    }

    private static void mostrarDatosEmpleado(Empleoyee empleoyee1) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-10s%-28s%-25s%-20s%-15s\n",
                "NIF",
                "Nombre",
                "Apellido1",
                "Apellido2",
                "Cuenta",
                "Antigüedad",
                "N. SS",
                "Categoria G.Profesional",
                "G.Cotización",
                "Email",
                "Id Departamento");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-19s%-24s%-12s%-35s%-15s\n",
                empleoyee1.getNIF(),
                empleoyee1.getNombre(),
                empleoyee1.getApellido1(),
                empleoyee1.getApellido2(),
                empleoyee1.getCuenta(),
                empleoyee1.getAntiguedad(),
                empleoyee1.getNASeguridadSocial(),
                empleoyee1.getCatGProfesional(),
                empleoyee1.getGCotizacion(),
                empleoyee1.getEmail(),
                empleoyee1.getIdDep());

        System.out.println();
        System.out.println();
    }

    private static String preguntarEmpleadoModifcar() {
        System.out.print("Introduce el NIF del empleado a modificar: ");
        id = inputValue.next();
        return id;
    }

    /**
     * @author Denis Andres Ion Badea
     * @param empleoyee1 le pasamos por parámetro el empleado actual en el que queremos que se modifiquen los datos
     * @return devuelve el número que el usuario indica para modificar los datos de ese empleado
     */
    private static int preguntaModificaDatos(Empleoyee empleoyee1) {
        System.out.println("Que datos deseas modificar?");
        System.out.println("1.- NIF");
        System.out.println("2.- Nombre");
        System.out.println("3.- Apellido1");
        System.out.println("4.- Apellido2");
        System.out.println("5.- Cuenta");
        System.out.println("6.- Antigüedad");
        System.out.println("7.- N. SS");
        System.out.println("8.- Categoría profesional");
        System.out.println("9.- Grupo Cotización");
        System.out.println("10.- Email");
        System.out.println("11.- Id del departamento");
        identificador = inputValue.nextInt();
        return identificador;
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion permite borrar un empleado a partir de su NIF
     */

    public static void eliminarEmpleado() throws IOException {

        System.out.print("Introduce el NIF del empleado a eliminar: ");
        String NIF = inputValue.next();
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNIF() == NIF) {
                empleados.remove(i);
            }
        }
        guardarEmpleados();
    }
    /**
     * Método que lee un archivo CSV llamado "Cotizacion.csv" y almacena los valores de la información de salarios en una lista de objetos de tipo Salari
     * @throws IOException si el archivo no existe o si ocurre algún error durante la lectura del archivo.
     * @author: Carlos Hernandez Garcia
     * @since V.2
     */
    public static void leerCotizacion() throws IOException {
        miFichero = new File("./src/Cotizacion.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] salarioArray = linea.split(";");
            cotizations.add(new Cotization(Integer.parseInt(salarioArray[0]), Integer.parseInt(salarioArray[1])));
            linea = flujoEntrada.readLine();
        }
    }



    /**
     * Método que muestra el salario total de cada departamento. Se suma el salario de cada empleado
     * que pertenezca al departamento y se muestra el resultado.
     * @author: Carlos Hernandez Garcia
     * @collaborator: Iker Rodriguez Montava
     * @throws IOException si ocurre un error de entrada/salida durante la ejecución del método
     */


    public static void consultarSalarioDepartamento() throws IOException {
        for (Department departamento : departamentos) {
            int suma = 0;
            for (Empleoyee empleado : empleados) {
                if (empleado.getIdDep() == departamento.getIdDep()) {
                    Cotization cotization = getSalarioPorGradoCotizacion(empleado.getGCotizacion());
                    if (cotization != null) {
                        suma += cotization.getDinero();
                    }
                }
            }
            System.out.println("El departamento " + departamento.getNombreDep() + " tiene un salario de: " + suma + "€");
        }
    }

    /**
     * Método que devuelve el salario correspondiente a un grado de cotización específico.
     *
     * @param gCotizacion el grado de cotización para el que se desea obtener el salario
     * @return el objeto Salario correspondiente al grado de cotización especificado o null si no se encuentra
     */
    private static Cotization getSalarioPorGradoCotizacion(int gCotizacion) {
        for (Cotization cotization : cotizations) {
            if (cotization.getGCot() == gCotizacion) {
                return cotization;
            }
        }
        return null;
    }

    /**
     * @throws IOException
     * @author: Denis Andres Ion Badea
     * @collaborator: Iker Rodriguez Montava
     * La funcion permite consultar el coste salarial total de la empresa
     */

    public static void consultarSalarioEmpresa() throws IOException {

        int suma = 0;
        int i = 0;
        for (Cotization cotization1 : cotizations) {
            suma += cotization1.getDinero() * cantECod[i];
            i++;
        }

        System.out.println("El coste salarial de la empresa es: " + suma + "€");
    }



    /**
     * @throws IOException
     * @author: Iker Rodriguez Montava
     * @collaborator: Carlos Hernandez Garcia
     * La funcion permite leer las horas extra y cargarlos en memoria
     */

    public static void leerHoras() throws IOException {
        miFichero = new File("./src/Horas.csv");
        if (!miFichero.exists()) {
            System.out.println("El fichero no existe");
        }
        BufferedReader flujoEntrada = new BufferedReader(new FileReader(miFichero));
        String linea = flujoEntrada.readLine();
        while (linea != null) { // Va leyendo lineas y mientras no llegue al final nos va mostrando su contenido
            String[] horasArray = linea.split(";");
            horas.add(new Hours(horasArray[0], horasArray[1], Integer.parseInt(horasArray[2])));
            linea = flujoEntrada.readLine();
        }
    }

    /**
     * @throws IOException
     * @author: Denis Andres Ion Badea
     * La funcion permite consultar las horas extras que se han hecho en cada departamento
     */

    public static void consultarHorasExtrasDepartamento() {
        int horasExtras = 0;
        System.out.println("1.- Comercial");
        System.out.println("2.- Contabilidad");
        System.out.println("3.- Informatica");
        System.out.println("4.- Personal");
        System.out.println();
        System.out.println("Introduce el departamento a consultar las horas extras: ");
        int eleccion = inputValue.nextInt();

        for (Empleoyee empleoyee1 : empleados) {
            for (Hours hours1 : horas) {
                if (empleoyee1.getIdDep() == eleccion) {
                    Empleoyee empleoyee2 = new Empleoyee(empleoyee1.getNIF(), empleoyee1.getNombre(), empleoyee1.getApellido1(), empleoyee1.getApellido2(), empleoyee1.getCuenta(),
                            empleoyee1.getAntiguedad(), empleoyee1.getNASeguridadSocial(), empleoyee1.getCatGProfesional(), empleoyee1.getGCotizacion(), empleoyee1.getEmail(), empleoyee1.getIdDep());
                    auxE.add(empleoyee2);
                    if (empleoyee1.getNIF().equals(hours1.getNIF())) {
                        horasExtras += hours1.getHoras();
                    }
                }
            }
        }
        System.out.println();
        System.out.println("EL departamento " + eleccion + " tiene " + horasExtras + " horas extras realizadas en total.");
    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion nos permite incorporar nuevas categorias profesionales
     */
    public static void nuevaCategoriaProfesional() throws IOException {

        System.out.print("Introduce el id de la nueva categoria: ");
        String id = inputValue.next();

        Category category1 = new Category(id);
        categorias.add(category1);
        System.out.println("Categoria añadida correctamente");
        System.out.println();
        System.out.println("Las categorias actuales son las siguientes: ");
        for (Category catProfesionales1 : categorias) {
            System.out.println(catProfesionales1.getCategoria());
        }
        guardarCategorias();

    }

    /**
     * @throws IOException
     * @author: Carlos Hernandez Garcia
     * La funcion nos permite guardar nuevas categorias profesionales
     */
    public static void guardarCategorias() {

        try {
            miFichero = new File("./src/CategoriasProfesionales.csv");
            if (!miFichero.exists()) {
                System.out.println("El fichero no existe");
            }
            BufferedWriter flujoSalida = new BufferedWriter(new FileWriter(miFichero));
            for (int i = 0; i < categorias.size(); i++) {
                flujoSalida.write(String.valueOf(categorias.get(i).getCategoria()));
                flujoSalida.write("\n");
            }
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        /**
         * @author: Carlos Hernandez Garcia
         * Borra un departamento del sistema
         * Primero se pide al usuario que introduzca el departamento a borrar y se busca en la lista de departamentos.
         * Si existe, se comprueba si el departamento contiene empleados.
         * Si contiene empleados, se pregunta al usuario si está seguro de continuar, y en caso afirmativo,
         * se borran tanto el departamento como los empleados asociados.
         * En caso contrario, solo se borra el departamento.
         * Finalmente, se guardan los cambios en el archivo
         * @throws IOException Si hay un error al guardar los datos en el archivo
         */

        public static void borrarDepartamento () throws IOException {
            boolean existe = false;
            boolean tieneEmpleados = false;
            System.out.print("Introduce el departamento a borrar: ");
            int idDep = inputValue.nextInt();

            for (Department departamento : departamentos) {
                if (departamento.getIdDep() == idDep) {
                    existe = true;
                    for (Empleoyee empleado : empleados) {
                        if (empleado.getIdDep() == departamento.getIdDep()) {
                            tieneEmpleados = true;
                            break;
                        }
                    }
                    break;
                }
            }

            if (existe) {
                if (tieneEmpleados) {
                    System.out.println("Este departamento contiene empleados, por lo que todos los empleados asociados se eliminarán.");
                    System.out.println("¿Está seguro que desea continuar?");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    int opcion = inputValue.nextInt();
                    if (opcion == 1) {
                        for (int i = 0; i < departamentos.size(); i++) {
                            if (departamentos.get(i).getIdDep() == idDep) {
                                for (int j = 0; j < empleados.size(); j++) {
                                    if (empleados.get(j).getIdDep() == idDep) {
                                        empleados.remove(j);
                                        j--;
                                    }
                                }
                                departamentos.remove(i);
                                System.out.println("Departamento borrado correctamente");
                                break;
                            }
                        }
                        guardarDepartamentos();
                        guardarEmpleados();
                    } else if (opcion == 2) {
                        System.out.println("Borrado cancelado");
                    }
                } else {
                    departamentos.removeIf(d -> d.getIdDep() == idDep);
                    System.out.println("Departamento borrado correctamente");
                    guardarDepartamentos();
                }
            } else {
                System.out.println("El departamento introducido no existe");
            }
        }


    /**
     * @author: Carlos Hernandez Garcia
     * @collaborator: Denis Andres Ion Badea
     * Método que permite borrar una categoría profesional especificada por el usuario una vez que no tenga empleados.
     * @throws IOException Excepción lanzada en caso de que haya algún problema al guardar los cambios en archivos
     * @since 2.0
     * @param inputValue Scanner object used for input
     */

    public static void deleteCategory() throws IOException {
        Category selectedCategory = null;
        boolean hasEmployees = false;
        boolean exists = false;

        System.out.print("Enter the category to delete: ");
        String choice = inputValue.next();

        for (Category category : categorias) {
            if (category.getCategoria().equals(choice)) {
                exists = true;
                for (Empleoyee employee : empleados) {
                    if (employee.getCatGProfesional().equals(category.getCategoria())) {
                        hasEmployees = true;
                        break;
                    } else {
                        hasEmployees = false;
                        selectedCategory = category;
                    }
                }
                break;
            }
            exists = false;
        }

        if (exists) {
            if (hasEmployees) {
                System.out.println("This category contains employees, so all employees associated with it will be deleted.");
                System.out.println("Are you sure you want to continue?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int confirm = inputValue.nextInt();

                for (int i = 0; i < categorias.size(); i++) {
                    if (categorias.get(i).getCategoria().equals(choice)) {
                        if (confirm == 1) {
                            for (int j = 0; j < empleados.size(); j++) {
                                if (empleados.get(j).getCatGProfesional().equals(categorias.get(i).getCategoria())) {
                                    empleados.remove(empleados.get(j));
                                    j--;
                                }
                            }
                            categorias.remove(categorias.get(i));
                            System.out.println("Category deleted successfully");
                            break;
                        } else if (confirm == 2) {
                            System.out.println("Deletion canceled");
                        }
                    }
                }
            } else {
                categorias.remove(selectedCategory);
                System.out.println("Category deleted successfully");
            }
            guardarCategorias();
            guardarEmpleados();
        } else {
            System.out.println("The entered category does not exist");
        }
    }


    /**
     * @author: Iker Rodriguez Montava
     * Interfaz para que el usuario pueda elegir que desea hacer
     */

    public static void Menu () {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Bienvenido al menu principal, elija una de las siguientes opciones:");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("0.- Salir");
        System.out.println("1.- Guardar archivos ");
        System.out.println("2.- Consultar datos ");
        System.out.println("3.- Incorporar datos ");
        System.out.println("4.- Modificar datos personales ");
        System.out.println("5.- Eliminar datos ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Introduce una opcion: ");
        opcion = inputValue.nextInt();
        System.out.println();
    }


    /**
     * @author: Carlos Hernandez Garcia
     * Submenu para la consulta de datos
     * @param inputValue Scanner object used for input
     * @return una opcion del submenu de consulta
     */

    public static void consultar () {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Bienvenido al menu para la consulta de datos");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Opciones: ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1.- Consultar datos empleado");
        System.out.println("2.- Consultar trabajadores por grupo cotizacion ");
        System.out.println("3.- Consultar trabajadores por departamento ");
        System.out.println("4.- Consultar cantidad de empleados por departamento");
        System.out.println("5.- Consultar coste salarial de la empresa");
        System.out.println("6.- Consultar coste salarial por categoria profesional ");
        System.out.println("7.- Consultar cantidad de horas extras por departamento ");
        System.out.println("8.- Consultar coste salarial de un departamento");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Introduce una opcion: ");
        opcion = inputValue.nextInt();
    }

    /**
     * @author: Iker Rodriguez Montava
     * @collaborator: Carlos Hernandez Garcia
     * Submenu para la incorporacion de datos
     */

    public static void incorporar () {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Bienvenido al menu para la incorporación de datos");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Opciones: ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1.- Incorporar nuevo trabajador ");
        System.out.println("2.- Incorporar nueva categoria ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Introduce una opcion: ");
        opcion = inputValue.nextInt();

    }
    /**
     * @author: Iker Rodriguez Montava
     * @collaborator: Carlos Hernandez Garcia
     * Submenu para la eliminacion de datos
     */

    public static void eliminar () {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Bienvenido al menu para la eliminacion de datos");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Opciones: ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1.- Eliminar departamentos ");
        System.out.println("2.- Eliminar datos categoria ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Introduce una opcion: ");
        opcion = inputValue.nextInt();
    }

    /**
     * @author: Iker Rodriguez Montava
     * Lugar donde se reunen todas las funciones para que el usuario pueda elegir que desea hacer.
     */


    public static void main (String[]args)  throws IOException {

        leerArchivos();
        boolean programa = true;

        do {
            Menu();
            switch (opcion) {

                case CERRAR_PROGRAMA:
                    programa = false;
                    System.out.println("Gracias por usar nuestro sistema.");

                    break;
                case EXPORTAR_CSV:
                    guardarTodo();
                    System.out.println("Todos los archivos se han guardado correctamente");
                    break;
                case CONSULTAR: //Error opcion no valida
                    consultar();
                    switch (opcion) {
                        case CONSULTAR_DATOS_EMPLEADO:
                            consultarEmpleado();
                            System.out.println();
                            break;
                        case CONSULTAR_EMPLEADOS_GCOTIZACION:
                            consultarEmpleadosCotizacion(); //Error no existe grupo cotización
                            System.out.println();
                            break;
                        case CONSULTAR_EMPLEADOS_DEPARTAMENTO:
                            consultarEmpleadosDepartamentos(); //Error no existe departamento
                            System.out.println();
                            break;
                        case CONSULTAR_CANTIDADEMPLEADOS_DEPARTAMENTO:
                            consultarCantidadEmpleados();
                            System.out.println();
                            break;
                        case CONSULTAR_SALARIO_EMPRESA:
                            consultarEmpleadosGrupoCotizacion();
                            consultarSalarioEmpresa();
                            System.out.println();
                            break;
                        case CONSULTAR_SALARIO_GCOT: //Error de "profesional"
                            consultarEmpleadosGrupoCotizacion();
                            consultar();
                            System.out.println(); //Error de no existe GCOT
                            break;
                        case CONSULTAR_HORASEXTRAS_DEPARTAMENTO: //Error departamento no existe
                            consultarHorasExtrasDepartamento();
                            System.out.println();
                            break;
                        case CONSULTAR_SALARIO_DEPARTAMENTO:
                            consultarEmpleadosGrupoCotizacion();
                            consultarSalarioDepartamento();
                            System.out.println();
                            break;
                    }
                    break;

                case INCORPORAR://Error opcion no valida
                    incorporar();
                    switch (opcion) {
                        case INCORPORAR_NUEVOTRABAJDOR:
                            incorporarEmpleados();//Error de integer
                            guardarEmpleados();
                            break;
                        case INCORPORAR_NUEVACATEGORIA:
                            nuevaCategoriaProfesional();
                            break;
                    }
                    break;
                case MODIFICAR_DATOSPERSONALES://Error de integer
                    modificarDatos();//Error de NIF erroneo
                    guardarEmpleados();//Poner que se ha cambiado correctamente
                    break;

                case ELIMINAR://Error opcion no valida
                    eliminar();
                    switch (opcion) {
                        case ELIMINAR_DEPARTAMENTOS://Error de elegir entre si o no y ponemos algo que no toca
                            borrarDepartamento();//Error introduce departamento a borrar y ponemos letras
                            break;
                        case ELIMINAR_DATOSCATEGORIA://Error de diferencias mayus minus
                            deleteCategory();
                            break;
                    }
                    break;
                default://Hacer try catch por strings
                    System.out.println("Opción incorrecta, introdúcela de nuevo.");
                    System.out.println();
            }
        } while (programa);
    }
}