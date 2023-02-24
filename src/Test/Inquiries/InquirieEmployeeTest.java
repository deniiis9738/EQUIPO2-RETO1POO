package Test.Inquiries;

import static org.junit.Assert.assertEquals;

import Inquiries.InquirieEmployee;
import org.junit.Test;

public class InquirieEmployeeTest {

    @Test
    public void testRealizeInquirie() {
        InquirieEmployee inquiry = new InquirieEmployee();
        inquiry.id = "12345678A"; // Suponemos que este es el NIF del empleado que queremos consultar
        inquiry.realizeInquirie();
        // Aquí comprobamos que la consulta haya devuelto el resultado esperado
        assertEquals("Nombre del empleado", inquiry.empleoyee.get(0).getNombre());
        assertEquals("Apellido1 del empleado", inquiry.empleoyee.get(0).getApellido1());
        assertEquals("Apellido2 del empleado", inquiry.empleoyee.get(0).getApellido2());
        assertEquals("Cuenta del empleado", inquiry.empleoyee.get(0).getCuenta());
        assertEquals("Antigüedad del empleado", inquiry.empleoyee.get(0).getAntiguedad());
        assertEquals("N. SS del empleado", inquiry.empleoyee.get(0).getNASeguridadSocial());
        assertEquals("Categoria G.Profesional del empleado", inquiry.empleoyee.get(0).getCatGProfesional());
        assertEquals("G.Cotización del empleado", inquiry.empleoyee.get(0).getGCotizacion());
        assertEquals("Id Departamento del empleado", inquiry.empleoyee.get(0).getIdDep());
    }

}