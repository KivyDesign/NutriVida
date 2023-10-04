package Controlador;

import Modelo.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ComidaData {

    private Connection con;
    private ComidaData comidaData;

    public ComidaData() {
        con = Conexion.getConexion();
    }

    public void guardarComida(Comida comida) {
        try {
            String sql = "INSERT INTO comida(nombre, detalle, cantCalorias, estado) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar en la tabla Comida");
        }
    }

    public void eliminarComida(int idComida) {
        try {
            String sql = "UPDATE comida SET estado = 0 WHERE idComida = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comida");
        }
    }

    public void modificarComida(Comida comida) {
        try {
            String sql = "UPDATE comida SET nombre = ?, detalle = ?, cantCalorias = ? WHERE idComida = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCalorias());
            ps.setInt(4, comida.getIdComida());
            ps.executeUpdate();
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comida");
        }
    }
}
