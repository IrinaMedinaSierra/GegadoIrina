package modell;

import java.time.LocalDate;

public class Ingresos{
    private int idl;
    private double importel;
    private LocalDate fechal;
    private String detallesl;
    private int idUsuario;
    private int idC;

    public Ingresos() {
    }

    public Ingresos(int idl, double importel, LocalDate fechal, String detallesl, int idUsuario, int idC) {
        this.idl = idl;
        this.importel = importel;
        this.fechal = fechal;
        this.detallesl = detallesl;
    }

    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public double getImportel() {
        return importel;
    }

    public void setImportel(double importel) {
        this.importel = importel;
    }

    public LocalDate getFechal() {
        return fechal;
    }

    public void setFechal(LocalDate fechal) {
        this.fechal = fechal;
    }

    public String getDetallesl() {
        return detallesl;
    }

    public void setDetallesl(String detallesl) {
        this.detallesl = detallesl;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    @Override
    public String toString() {
        return "Ingresos{" +
                "idl=" + idl +
                ", importel=" + importel +
                ", fechal=" + fechal +
                ", detallesl='" + detallesl + '\'' +
                ", idUsuario=" + idUsuario +
                ", idC=" + idC +
                '}';
    }
}
