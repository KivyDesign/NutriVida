package Controlador;

import Modelo.Dieta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DietaData {

    private Connection con = null;
    private DietaData dietaData;

    public DietaData() {
        con = Conexion.getConexion();
    }

    public void guardarDieta(Dieta dieta) {
        try {
            String sql = "INSERT INTO dieta (nombre, idPaciente, pesoInicial, pesoFinal, fechaInicial, fechaFinal, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, java.sql.Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, java.sql.Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, true);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dieta.setIdDieta(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta " + ex.getMessage());
        }
    }

    public void eliminarDietaPorId(int id) {
        try {
            String sql = "UPDATE dieta SET estado = 0 WHERE idDieta = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta");
        }
    }

    public void modificarDieta(Dieta dieta) {
        try {
            String sql = "UPDATE dieta SET nombre = ?, idPaciente = ?, pesoInicial = ?, pesoFinal = ?, fechaInicial = ?, fechaFinal = ?, estado = ? WHERE idDieta = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setString(2, dieta.getPaciente().getIdPaciente() + "");
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, dieta.isEstado());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta");
        }
    }

    public Dieta buscarDietaporIdPaciente(int idPaciente) {
        Dieta dieta = null;
        PreparedStatement ps = null;
        PacienteData pacData = new PacienteData();
        try {
            String sql = "SELECT idDieta, nombre, idPaciente, pesoInicial, pesoFinal, fechaInicial, fechaFinal, estado FROM dieta WHERE idPaciente = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(pacData.buscarPacientePorId(rs.getInt("idPaciente")));
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta");
        }
        return dieta;
    }
}
