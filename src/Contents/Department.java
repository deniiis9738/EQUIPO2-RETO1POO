package Contents;

/**
 * @author Carlos , Denis e Iker
 * @version V2
 */
public class Department {
    public int idDep;
    public String nombreDep;

    public Department(int idDep, String nombreDep) {
        this.idDep = idDep;
        this.nombreDep = nombreDep;
    }

    public int getIdDep() {
        return idDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }
}