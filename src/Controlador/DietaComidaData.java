package Controlador;

import Modelo.Comida;
import Modelo.DietaComida;
import Modelo.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DietaComidaData {

    private Connection con = null;
    private DietaComidaData dietaComidaData;
    private DietaData dietaData = new DietaData();
    private ComidaData comidaData = new ComidaData();

    public DietaComidaData() {
        con = Conexion.getConexion();
    }

    public void guardarDietaComida(DietaComida dietaComida) {
        String sql = "INSERT INTO dietacomida (idComida, idDieta, horario, porcion) VALUES (?, ?, ? , ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dietaComida.getComida().getIdComida());
            ps.setInt(2, dietaComida.getDieta().getIdDieta());

            /**
             * Utilice su Statusenumeración como String(varchar), gracias a los
             * métodos de enum : Para escribirlo, use a.getStatus().name():
             * pst.setObject(3, a.getStatus().name()); Para leerlo
             * utiliceStatus.valueOf(rs.getString(<column index>))
             */
            ps.setObject(3, dietaComida.getHorario().name());
            ps.setDouble(4, dietaComida.getPorcion());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dietaComida.setIdDietaComida(rs.getInt(1));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DietaComida");
        }
    }

    public void modificarDietaComida(DietaComida dietaComida) {
        try {
            String sql = "UPDATE dietacomida SET idComida = ?, idDieta = ?, horario = ?, porcion = ? WHERE idDietaComida = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dietaComida.getComida().getIdComida());
            ps.setInt(2, dietaComida.getDieta().getIdDieta());
            ps.setObject(3, dietaComida.getHorario().name());
            ps.setDouble(4, dietaComida.getPorcion());
            ps.setInt(5, dietaComida.getIdDietaComida());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DietaComida");
        }
    }

    public void eliminarDietaComida(int idDietaComida) {
        try {
            String sql = "DELETE FROM dietacomida WHERE idDietaComida = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDietaComida);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DietaComida");
        }
    }

    public ArrayList<DietaComida> listarDietaComidas(int idDieta) {
        ArrayList<DietaComida> dietas = new ArrayList<>();

        try {
            String sql = "SELECT idDietaComida, idComida, idDieta, horario, porcion FROM dietacomida WHERE idDieta = ? order by horario";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            // Recorro el ResultSet y lo cargo en el Array dietas
            while (rs.next()) {
                DietaComida dietaComida = new DietaComida();
                dietaComida.setIdDietaComida(rs.getInt("idDietaComida"));
                dietaComida.setComida(comidaData.buscarComidaPorId(rs.getInt("idComida")));
                dietaComida.setDieta(dietaData.buscarDietaPorId(rs.getInt("idDieta")));
                dietaComida.setHorario(Horario.valueOf(rs.getString("horario")));
                dietaComida.setPorcion(rs.getInt("porcion"));

                dietas.add(dietaComida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla dietaComida " + ex.getMessage());
        }
        // Retorno el Array dietaComida con los valores de la consulta
        return dietas;
    }
    public void modificarPorcion(int idDietaComida,int porcion){
        try{
        String sql= "UPDATE dietacomida SET  porcion = ? WHERE idDietaComida = ?";
       PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, porcion);
            ps.setInt(2, idDietaComida);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DietaComida");
        } 
    }
    
    public DietaComida buscarDietaComidaPorId(int idComida) {
        DietaComida dietacomida = null;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT idDietaComida, idComida, idDieta, horario, porcion FROM dietacomida WHERE idComida = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dietacomida = new DietaComida();
                dietacomida.setIdDietaComida(rs.getInt("idDietaComida"));
                dietacomida.setComida(comidaData.buscarComidaPorId(rs.getInt("idComida")));
                dietacomida.setDieta(dietaData.buscarDietaPorId(rs.getInt("idDieta")));
                dietacomida.setHorario(Horario.valueOf(rs.getString("horario")));
                dietacomida.setPorcion(rs.getInt("porcion"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DietaComida");
        }
        return dietacomida;
}
}