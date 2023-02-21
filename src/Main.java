import Documents.Read_Empleoyee;
import Documents.Write_Empleoyee;
import Inquiries.InquirieEmployee;
import Modify.Add.Add_Employee;

import java.io.IOException;

public class Main {

    public static final int CERRAR_PROGRAMA = 0;
    public static final int EXPORTAR_CSV = 1;
    public static final int CONSULTAR = 2;
    public static final int INCORPORAR = 3;
    public static final int MODIFICAR_DATOSPERSONALES = 4;
    public static final int ELIMINAR = 5;
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

    /*public static void main (String[]args)  throws IOException {

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
    }*/
}