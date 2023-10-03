package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conexion = null;

    private Conexion() {}
    
    public static Connection getConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(
                        URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC",
                        USUARIO,
                        PASSWORD
                );
                
//                JOptionPane.showMessageDialog(null, "Conectado");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el Driver" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse" + ex.getMessage());
            }
        }
        return conexion;
    }
}
