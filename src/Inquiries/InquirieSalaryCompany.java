package Inquiries;

import Contents.Cotization;
import Documents.Read_Cotization;

public class InquirieSalaryCompany extends Inquiries {

    private static int[] cantECod = new int[7];

    @Override
    public void realizeInquirie() {
        int suma = 0;
        int i = 0;
        for (Cotization salario1 : Read_Cotization.cotization) {
            suma += salario1.getDinero() * cantECod[i];
            i++;
        }

        System.out.println("El coste salarial de la empresa es: " + suma + "€");
    }
}
