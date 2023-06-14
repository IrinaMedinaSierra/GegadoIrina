package modell;

import java.time.LocalDate;


public class Gastos {
    private int idG;
    private LocalDate fechaG;
    private int idC;
    private double ImporteG;
    private String detallesG;
    private int idUsuario;

    public Gastos() {
    }

    public Gastos(int idG, LocalDate fechaG, int idC, double importeG, String detallesG, int idUsuario) {
        this.idG = idG;
        this.fechaG = fechaG;
        this.idC = idC;
        ImporteG = importeG;
        this.detallesG = detallesG;
    }

    public Gastos(LocalDate fechaG, int idC, double importeG, String detallesG) {
        this.fechaG = fechaG;
        this.idC = idC;
        ImporteG = importeG;
        this.detallesG = detallesG;
    }

    public int getIdG() {
        return idG;
    }

    public void setIdG(int idG) {
        this.idG = idG;
    }

    public LocalDate getFechaG() {
        return fechaG;
    }

    public void setFechaG(LocalDate fechaG) {
        this.fechaG = fechaG;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public double getImporteG() {
        return ImporteG;
    }

    public void setImporteG(double importeG) {
        ImporteG = importeG;
    }

    public String getDetallesG() {
        return detallesG;
    }

    public void setDetallesG(String detallesG) {
        this.detallesG = detallesG;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Gastos{" +
                "idG=" + idG +
                ", fechaG=" + fechaG +
                ", idC=" + idC +
                ", ImporteG=" + ImporteG +
                ", detallesG='" + detallesG + '\'' +
                ", idUsuario=" + idUsuario +
                '}';
    }
}
