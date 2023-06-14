package services;

import modell.Categorias;
import modell.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriasDAO extends Conexion {
    String sql;
    Connection con = conectar();
    public boolean create (Categorias a) {
        sql = "INSERT INTO categoria (idC, nombreC) VALUES (?,?);";
        try {
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, a.getIdC());
            pt.setString(2, a.getNombreC());
            pt.executeUpdate();
            con.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean read (Categorias a) {
        sql = "SELECT * FROM categoria WHERE idC=? and nombreC=?;";
        try {
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setInt(1, a.getIdC());
            pt.setString(2, a.getNombreC());
            ResultSet rs = pt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public boolean delete (int idC) {
        sql = "DELETE FROM categoria WHERE idC=?;";
        try {
           PreparedStatement pt = con.prepareStatement(sql);
           pt.setInt(1, idC);
           pt.executeUpdate();
           con.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
