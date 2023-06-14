package modell;

public class Usuario {
    private String userN;
    private String passU;
    private int idU;

    public Usuario() {
    }

    public Usuario(String userN, String passU, int idU) {
        this.userN = userN;
        this.passU = passU;
        this.idU = idU;
    }

    public Usuario(String userN, String passU) {
        this.userN = userN;
        this.passU = passU;
    }

    public String getUserN() {
        return userN;
    }

    public String getPassU() {
        return passU;
    }

    public int getIdU() {
        return idU;
    }

    public void setUserN(String userN) {
        this.userN = userN;
    }

    public void setPassU(String passU) {
        this.passU = passU;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreU='" + userN + '\'' +
                ", passU='" + passU + '\'' +
                ", idU=" + idU +
                '}';
    }
}
