package Controlador;

import Modelo.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public Comida buscarComidaPorId(int idComida) {
        Comida comida = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idComida, nombre, detalle, cantCalorias, estado FROM comida WHERE idComida = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comida");
        }
        return comida;
    }

    public Comida buscarComidaPorNombre(String nombre) {
        Comida comida = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idComida, nombre, detalle, cantCalorias, estado FROM comida WHERE nombre = ? AND estado = 1";
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comida");
        }
        return comida;
    }

    public ArrayList<Comida> listarComidasCalorias(int calMin, int calMax) {
        ArrayList<Comida> comidas = new ArrayList<>();

        try {
            String sql = "SELECT idComida FROM comida WHERE estado = 1 and cantCalorias>=? and cantCalorias<=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, calMin);
            ps.setInt(2, calMax);
            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array alumnos
            while (rs.next()) {

                comidas.add(buscarComidaPorId(rs.getInt("idComida")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "listarAlumnos = Error al acceder a la tabla Alumno: " + ex.getMessage());
        }
        // Retorno el Array alumnos con los valores de la consulta
        return comidas;
    }
}
