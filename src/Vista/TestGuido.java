package Vista;

import Controlador.Conexion;
import java.sql.Connection;

public class TestGuido {

    public static void main(String[] args) {
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            System.out.println("NutriVida - Estado: Conectado");
        } else {
            System.out.println("Nutrivida - Estado: Error");
        }
        
        
    }
    
}
