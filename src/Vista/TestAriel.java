package Vista;

import Controlador.ComidaData;
import Controlador.Conexion;
import Modelo.Comida;
import java.sql.Connection;

public class TestAriel {

    public static void main(String[] args) {
        //probando ComidaData.java
        
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            System.out.println("NutriVida - Estado: Conectado");
        } else {
            System.out.println("Nutrivida - Estado: Error");
        }
        
        // Inserto una comida
        ComidaData comData = new ComidaData();
        Comida com1 = new Comida("Manzana","Fruta",52,true);
        comData.guardarComida(com1);
    }
    
}
