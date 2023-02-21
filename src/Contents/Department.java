package Contents;

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