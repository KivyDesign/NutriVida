package Vista;

import Controlador.Conexion;
import Controlador.PacienteData;
import Modelo.Paciente;
import java.sql.Connection;

public class NutriVida {

    public static void main(String[] args) {
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            System.out.println("Sistema de Gestión para la Universidad de La Punta - Estado: Conectado");
        } else {
            System.out.println("Sistema de Gestión para la Universidad de La Punta - Estado: Error");
        }

        //agrego un paciente nuevo
        Paciente paciente = new Paciente(11112222,"Pablo Gomez","Colon 2332","123-456",true);
        PacienteData pacData=new PacienteData();
        pacData.guardarPaciente(paciente);

    }

}
