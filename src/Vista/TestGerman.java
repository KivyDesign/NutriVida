package Vista;

import Controlador.Conexion;
import Controlador.PacienteData;
import Modelo.Paciente;
import java.sql.Connection;

public class TestGerman {

    public static void main(String[] args) {
        // Realizo la coneccion a la DB
        Connection con = Conexion.getConexion();

        // Si la conexion fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexion
        if (con != null) {
            System.out.println("NutriVida - Estado: Conectado");
        } else {
            System.out.println("NutriVida - Estado: Error");
        }

        //agrego un paciente nuevo
//        Paciente paciente0 = new Paciente(11112222,"Pablo Gomez","Colon 2332","123-456",true);
//        Paciente paciente1 = new Paciente(11113333,"Pabla Gomes","Union 562","123-564",true);
//        Paciente paciente2 = new Paciente(11114444,"Paola Guzman","Pellegrini 456","423-456",true);
//        Paciente paciente3 = new Paciente(11115555,"Paulo Salas","Campos 458","123-456",true);
//        Paciente paciente4 = new Paciente(11116666,"Paula Diaz","Belgrano 123","456-456",true);
//        Paciente paciente5 = new Paciente(11117777,"Pedro Perez","Talleres 789","123-456",true);
//        Paciente paciente6= new Paciente(11118888,"Adrian Gil","Maipu 471","123-741",true);
//        Paciente paciente7 = new Paciente(11119999,"Adriana Ramos","Mitre 1447","415-456",true);
//        Paciente paciente8 = new Paciente(11110000,"Carlos Robledo","Pasco 1587","478-456",true);
//        Paciente paciente9 = new Paciente(11111111,"Carla Funes","Sarmiento 569","100-456",true);
        PacienteData pacData=new PacienteData();
//        pacData.guardarPaciente(paciente0);
//        pacData.guardarPaciente(paciente1);
//        pacData.guardarPaciente(paciente2);
//        pacData.guardarPaciente(paciente3);
//        pacData.guardarPaciente(paciente4);
//        pacData.guardarPaciente(paciente5);
//        pacData.guardarPaciente(paciente6);
//        pacData.guardarPaciente(paciente7);
//        pacData.guardarPaciente(paciente8);
//        pacData.guardarPaciente(paciente9);
        
        // Elimino un paciente
//        pacData.eliminarPaciente(8);

        // Modificar un paciente
//        Paciente paciente = new Paciente(1, 22221111,"Gomez Pablo","2332 Colon","456-123",false);
//        pacData.modificarPaciente(paciente);

        // Consulta de un paciente
        Paciente paciente =pacData.buscarPacientePorDni(22221111);
        System.out.println(paciente.toString());
    }

}
