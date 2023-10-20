package Vista;

import Controlador.ComidaData;
import Controlador.Conexion;
import Modelo.Comida;
import java.sql.Connection;
import java.util.ArrayList;

public class TestAriel {

    public static void main(String[] args) {
        // Probando ComidaData
        
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            System.out.println("NutriVida - Estado: Conectado");
        } else {
            System.out.println("Nutrivida - Estado: Error");
        }
        
        // Agrego una comida
        ComidaData comData = new ComidaData();
//        Comida com1 = new Comida("Manzana", "Fruta", 52, true);
//        Comida com2 = new Comida("Lenteja", "Legumbres", 116, true);
//        Comida com3 = new Comida("Banana", "Fruta", 89, true);
//        Comida com4 = new Comida("Atún", "Pescado", 130, true);
//        Comida com5 = new Comida("Zanahoria", "Verdura", 37,true);
//        comData.guardarComida(com1);
//        comData.guardarComida(com2);
//        comData.guardarComida(com3);
//        comData.guardarComida(com4);
//        comData.guardarComida(com5);

        // Elimino una comida
//        comData.eliminarComida(4);

        // Modifico una comida
//        Comida comida = new Comida(1, "Frutilla", "Es una fruta", 33, false);
//        comData.modificarComida(comida);

        // Consulta de una comida
//        Comida comid = comData.buscarComidaPorId(4);
//        System.out.println(comid.toString());

          ArrayList<Comida> lista = comData.listarComidas();
          for (Comida comida : lista) {
              System.out.println(comida.toString());
        }
          System.out.println("");
    }
    
}
