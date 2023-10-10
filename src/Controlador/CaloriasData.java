package Controlador;

import Modelo.Calorias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CaloriasData {

    private Connection con;

    public CaloriasData() {
        con = Conexion.getConexion();
    }

    /*
     Estructura de la tabla calorias
     int idCalorias
     int idGrupoAlimenticio
     String nombre
     int calorias
     int proteinas
     int grasa
     int carbohidratos
     int fibra
     int colesterol
     Boolean estado
     */
    public void guardarCalorias(Calorias calorias) {
        PreparedStatement ps = null;
        try {
            String sql = "INSERT INTO calorias(idGrupoAlimenticio, nombre, calorias, proteinas, grasa, carbohidratos, fibra, colesterol, estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, calorias.getIdGrupoAlimenticio());
            ps.setString(2, calorias.getNombre());
            ps.setInt(3, calorias.getCalorias());
            ps.setInt(4, calorias.getProteinas());
            ps.setInt(5, calorias.getGrasa());
            ps.setInt(6, calorias.getCarbohidratos());
            ps.setInt(7, calorias.getFibra());
            ps.setInt(8, calorias.getColesterol());
            ps.setBoolean(9, true);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                calorias.setIdCalorias(rs.getInt(1));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar en la tabla Calorias" + ex.getMessage());
        }
    }

    public void eliminarCalorias(int idCalorias) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE calorias SET estado = 0 WHERE idCalorias = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCalorias);

            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Calorias" + ex.getMessage());
        }
    }

    public void modificarCalorias(Calorias calorias) {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE calorias SET idGrupoAlimenticio = ?, nombre = ?, calorias = ?, proteinas = ?, grasa = ?, carbohidratos = ?, fibra = ?, colesterol = ?, estado = ? WHERE idCalorias = ?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, calorias.getIdGrupoAlimenticio());
            ps.setString(2, calorias.getNombre());
            ps.setInt(3, calorias.getCalorias());
            ps.setInt(4, calorias.getProteinas());
            ps.setInt(5, calorias.getGrasa());
            ps.setInt(6, calorias.getCarbohidratos());
            ps.setInt(7, calorias.getFibra());
            ps.setInt(8, calorias.getColesterol());
            ps.setBoolean(9, calorias.getEstado());

            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Calorias" + ex.getMessage());
        }
    }

    public Calorias buscarCaloriasPorId(int idCalorias) {
        Calorias calorias = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idGrupoAlimenticio, nombre, calorias, proteinas, grasa, carbohidratos, fibra, colesterol, estado FROM calorias WHERE idCalorias = ?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, idCalorias);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                calorias = new Calorias();
                calorias.setIdCalorias(rs.getInt("idCalorias"));
                calorias.setIdGrupoAlimenticio(rs.getInt("idGrupoAlimenticio"));
                calorias.setNombre(rs.getString("nombre"));
                calorias.setCalorias(rs.getInt("calorias"));
                calorias.setProteinas(rs.getInt("proteinas"));
                calorias.setGrasa(rs.getInt("grasa"));
                calorias.setCarbohidratos(rs.getInt("carbohidratos"));
                calorias.setFibra(rs.getInt("fibra"));
                calorias.setFibra(rs.getInt("colesterol"));
                calorias.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Calorias" + ex.getMessage());
        }
        return calorias;
    }

    public ArrayList<Calorias> listarCaloriasPorLimites(int calMin, int calMax) {
        ArrayList<Calorias> calorias = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idCalorias FROM calorias WHERE estado = 1 AND cantCalorias >= ? AND cantCalorias <= ?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, calMin);
            ps.setInt(2, calMax);

            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array calorias
            while (rs.next()) {
                calorias.add(buscarCaloriasPorId(rs.getInt("idCalorias")));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "listarCalorias = Error al acceder a la tabla Calorias: " + ex.getMessage());
        }
        // Retorno el Array calorias con los valores de la consulta
        return calorias;
    }

    public ArrayList<Calorias> listarCalorias() {
        ArrayList<Calorias> calorias = new ArrayList<>();

        try {
            // La consulta funciona en MySQL
            String sql = "SELECT * FROM calorias WHERE estado = 1 ORDER BY calorias";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array calorias
            while (rs.next()) {
                Calorias caloria = new Calorias();

                caloria.setIdCalorias(rs.getInt("idCalorias"));
                caloria.setIdGrupoAlimenticio(rs.getInt("idGrupoAlimenticio"));
                caloria.setNombre(rs.getString("nombre"));
                caloria.setCalorias(rs.getInt("calorias"));
                caloria.setProteinas(rs.getInt("proteinas"));
                caloria.setGrasa(rs.getInt("grasa"));
                caloria.setCarbohidratos(rs.getInt("carbohidratos"));
                caloria.setFibra(rs.getInt("fibra"));
                caloria.setColesterol(rs.getInt("colesterol"));
                caloria.setEstado(rs.getBoolean("estado"));

                calorias.add(caloria);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "listarCalorias = Error al acceder a la tabla Calorias: " + ex.getMessage());
        }
        // Retorno el Array calorias con los valores de la consulta
        return calorias;
    }
    
    /*
     Estructura de la tabla calorias
     int idCalorias
     int idGrupoAlimenticio
     String nombre
     int calorias
     int proteinas
     int grasa
     int carbohidratos
     int fibra
     int colesterol
     Boolean estado
     */
    public ArrayList<Calorias> listarCaloriasPorGrupoalimenticio(int idGrupoAlimenticio) {
        ArrayList<Calorias> calorias = new ArrayList<>();

        try {
            // La consulta funciona en MySQL
            String sql = "SELECT * FROM calorias WHERE idGrupoAlimenticio = ? AND estado = 1 ORDER BY nombre";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idGrupoAlimenticio);
            
            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array calorias
            while (rs.next()) {
                Calorias caloria = new Calorias();

                caloria.setIdCalorias(rs.getInt("idCalorias"));
                caloria.setIdGrupoAlimenticio(rs.getInt("idGrupoAlimenticio"));
                caloria.setNombre(rs.getString("nombre"));
                caloria.setCalorias(rs.getInt("calorias"));
                caloria.setProteinas(rs.getInt("proteinas"));
                caloria.setGrasa(rs.getInt("grasa"));
                caloria.setCarbohidratos(rs.getInt("carbohidratos"));
                caloria.setFibra(rs.getInt("fibra"));
                caloria.setColesterol(rs.getInt("colesterol"));
                caloria.setEstado(rs.getBoolean("estado"));

                calorias.add(caloria);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "listarCalorias = Error al acceder a la tabla Calorias: " + ex.getMessage());
        }
        // Retorno el Array calorias con los valores de la consulta
        return calorias;
    }

    public void activarCalorias() {
        PreparedStatement ps = null;
        try {
            String sql = "UPDATE calorias SET estado = 1 WHERE estado = 0";
            ps = con.prepareStatement(sql);

            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Calorias" + ex.getMessage());
        }
    }
}
