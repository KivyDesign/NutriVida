package Controlador;

import Modelo.Comida;
import Modelo.Dieta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
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
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, dieta.isEstado());
            ps.setInt(8, dieta.getIdDieta());
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
            String sql = "SELECT idDieta, nombre, idPaciente, pesoInicial, pesoFinal, fechaInicial, fechaFinal, estado FROM dieta WHERE estado=1 AND idPaciente = ?";
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

    public Dieta buscarDietaPorId(int idDieta) {
        Dieta dieta = null;
        PreparedStatement ps = null;
        PacienteData pacData = new PacienteData();
        try {
            String sql = "SELECT idDieta, nombre, idPaciente, pesoInicial, pesoFinal, fechaInicial, fechaFinal, estado FROM dieta WHERE idDieta = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
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

    public ArrayList<Dieta> listarDietas() {
        ArrayList<Dieta> dietas = new ArrayList<>();

        try {
            String sql = "SELECT d.idDieta FROM dieta d,paciente p WHERE d.idPaciente=p.idPaciente and d.estado = 1 and p.estado=1";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array dietas
            while (rs.next()) {

                dietas.add(buscarDietaPorId(rs.getInt("idDieta")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta " + ex.getMessage());
        }
        // Retorno el Array dietas con los valores de la consulta
        return dietas;
    }

    public ArrayList<Dieta> listarDietasNoCumplidas() {
        ArrayList<Dieta> dietas = new ArrayList<>();

        try {
            String sql = "SELECT idDieta FROM dieta d,paciente p WHERE p.idPaciente=d.idPaciente and pesoFinal < pesoActual and fechafinal <= ? and d.estado=1 and p.estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(LocalDate.now()));
            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array dietas
            while (rs.next()) {

                dietas.add(buscarDietaPorId(rs.getInt("idDieta")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta " + ex.getMessage());
        }
        // Retorno el Array dietas con los valores de la consulta
        return dietas;
    }
}
