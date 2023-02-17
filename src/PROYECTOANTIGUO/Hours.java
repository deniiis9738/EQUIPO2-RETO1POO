package PROYECTOANTIGUO;

public class Hours {

    public String NIF;
    public String fecha;
    public int horas;

    public Hours(String NIF, String fecha, int horas) {
        this.NIF = NIF;
        this.fecha = fecha;
        this.horas = horas;
    }

    public String getNIF() {
        return NIF;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHoras() {
        return horas;
    }
}


