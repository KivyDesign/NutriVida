package Controlador;

import Modelo.Historial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HistorialData {

    private Connection con = null;
    private HistorialData historialData;

    public HistorialData() {
        con = Conexion.getConexion();
    }

    public void guardarHistorial(Historial historial) {
        String sql = "INSERT INTO historial(idPaciente, peso, fechaConsulta) VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historial.getPaciente().getIdPaciente());
            ps.setDouble(2, historial.getPeso());
            ps.setDate(3, java.sql.Date.valueOf(historial.getFechaConsulta()));
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial");
        }
    }

    public void modificarHistorial(Historial historial) {
        String sql = "UPDATE historial SET idPaciente = ?, peso = ?, fechaConsulta = ? WHERE idHistorial = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, historial.getPaciente().getIdPaciente());
            ps.setDouble(2, historial.getPeso());
            ps.setDate(3, java.sql.Date.valueOf(historial.getFechaConsulta()));
            ps.setInt(4, historial.getIdHistorial());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial");
        }
    }

    public Historial buscarHistorialPorId(int idHistorial) {
        Historial historial = null;
        PreparedStatement ps = null;
        PacienteData pacData = new PacienteData();
        try {
            String sql = "SELECT idHistorial, idPaciente, peso, fechaConsulta FROM historial WHERE idHistorial = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHistorial);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                historial = new Historial();
                historial.setIdHistorial(rs.getInt("idHistorial"));
                historial.setPaciente(pacData.buscarPacientePorId(rs.getInt("idPaciente")));
                historial.setPeso(rs.getDouble("peso"));
                historial.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial");
        }
        return historial;
    }

    public void eliminarHistorial(int idHistorial) {
        try {
            String sql = "DELETE * FROM historial WHERE idHistorial = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHistorial);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Historial");
        }
    }

    public ArrayList<Historial> obtenerHistorialXId(int idPaciente) {
        ArrayList<Historial> listaHistorial = new ArrayList<>();

        try {
            String sql = "SELECT idHistorial FROM historial  WHERE idPaciente = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idPaciente);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listaHistorial.add(buscarHistorialPorId(rs.getInt("idHistorial")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla historial " + ex.getMessage());
        }
        return listaHistorial;
    }
}
