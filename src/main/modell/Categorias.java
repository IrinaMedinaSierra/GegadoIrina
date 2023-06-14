package modell;

public class Categorias {
    private int idC;
    private String nombreC;
    private int idT;

    public Categorias() {
    }

    public Categorias(int idC, String nombreC, int idT) {
        this.idC = idC;
        this.nombreC = nombreC;
        this.idT = idT;
    }

    public Categorias(String nombreC, int idT) {
        this.nombreC = nombreC;
        this.idT = idT;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "idC=" + idC +
                ", nombreC='" + nombreC + '\'' +
                ", idT=" + idT +
                '}';
    }
}
