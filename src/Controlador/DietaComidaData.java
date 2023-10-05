package Controlador;

import Modelo.DietaComida;
import Modelo.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DietaComidaData {

    private Connection con = null;
    private DietaComidaData dietaComidaData;

    public DietaComidaData() {
        con = Conexion.getConexion();
    }

    public void guardarDietaComida(DietaComida dietaComida) {
        String sql = "INSERT INTO dietaComida (idComida,idDieta,horario,porcion) VALUES ( ?, ?, ? , ?)";
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
            String sql = "UPDATE dietaComida SET idComida";
        } catch (Exception e) {
        }
    }
}
