package Controlador;

import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PacienteData {

    private Connection con = null;
    private PacienteData pacienteData;

    public PacienteData() {
        con = Conexion.getConexion();
    }

    public void guardarPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente(dni, nombre, domicilio, telefono,pesoActual, estado) VALUES(?, ?, ?,?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setBoolean(6, paciente.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar en la tabla Paciente");
        }
    }

    public void eliminarPaciente(int idPaciente) {
        try {
            String sql = "UPDATE paciente SET estado = 0 WHERE idPaciente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
    }

    public void modificarPaciente(Paciente paciente) {
        try {
            String sql = "UPDATE paciente SET dni = ?, nombre = ?, domicilio = ?, telefono = ?,pesoActual=? WHERE idPaciente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setInt(6, paciente.getIdPaciente());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
    }

    public Paciente buscarPacientePorDni(int dni) {
        Paciente paciente = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idPaciente, dni, nombre, domicilio, telefono,pesoActual, estado FROM paciente WHERE dni = ?";

            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
        return paciente;
    }

    public Paciente buscarPacientePorId(int idPaciente) {
        Paciente paciente = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idPaciente, dni, nombre, domicilio, telefono,pesoActual, estado FROM paciente WHERE idPaciente = ?";

            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
        return paciente;
    }

    public void modificarPesoActual(int idPaciente, double pesoActual) {
        try {
            String sql = "UPDATE paciente SET pesoActual = ? WHERE idPaciente = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, pesoActual);
            ps.setInt(2, idPaciente);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
    }

}
