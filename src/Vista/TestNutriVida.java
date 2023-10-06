package Vista;

import Controlador.ComidaData;
import Controlador.Conexion;
import Controlador.DietaData;
import Controlador.PacienteData;
import Modelo.Comida;
import java.sql.Connection;

public class TestNutriVida {

    public static void main(String[] args) {
        /**
         * =====================================================================
         * Aquí van todas las pruebas realizadas por el Grupo 22
         * =====================================================================
         */

        // Realizo la conexión a la DB
        Connection con = Conexion.getConexion();

        // Si la conexión fue exitosa lo informo como conectado con un (sout)
        // para no tener ese molesto dialogo de conexión
        if (con != null) {
            System.out.println("NutriVida - Estado: Conectado");
        } else {
            System.out.println("Nutrivida - Estado: Error");
        }

        /**
         * ---------------------------------------------------------------------
         * Probando ComidaData
         * ---------------------------------------------------------------------
         */
        // Agrego una comida
        ComidaData comData = new ComidaData();
//        Comida com1 = new Comida("Manzana", "Fruta", 52, true);
//        Comida com2 = new Comida("Lenteja", "Legumbres", 116, true);
//        Comida com3 = new Comida("Banana", "Fruta", 89, true);
//        Comida com4 = new Comida("Atún", "Pescado", 130, true);
//        Comida com5 = new Comida("Zanahoria", "Verdura", 37, true);
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
        Comida comid = comData.buscarComidaPorId(4);
        System.out.println(comid.toString());
        
        // Listar calorias de comidas
        for (Comida comida : comData.listarComidasCalorias(89, 130)) {
            System.out.println("comida calorias requeridas " + comida.getNombre());
        }
        
        /**
         * ---------------------------------------------------------------------
         * Probando PacienteData
         * ---------------------------------------------------------------------
         */

        // Agrego un paciente nuevo
        PacienteData pacData = new PacienteData();
        
//        Paciente paciente0 = new Paciente(11112222, "Pablo Gomez", "Colon 2332", "123-456", true);
//        Paciente paciente1 = new Paciente(11113333, "Pabla Gomes", "Union 562", "123-564", true);
//        Paciente paciente2 = new Paciente(11114444, "Paola Guzman", "Pellegrini 456","423-456", true);
//        Paciente paciente3 = new Paciente(11115555, "Paulo Salas", "Campos 458", "123-456", true);
//        Paciente paciente4 = new Paciente(11116666, "Paula Diaz", "Belgrano 123", "456-456", true);
//        Paciente paciente5 = new Paciente(11117777, "Pedro Perez", "Talleres 789", "123-456", true);
//        Paciente paciente6= new Paciente(11118888, "Adrian Gil", "Maipu 471", "123-741", true);
//        Paciente paciente7 = new Paciente(11119999, "Adriana Ramos", "Mitre 1447", "415-456", true);
//        Paciente paciente8 = new Paciente(11110000, "Carlos Robledo", "Pasco 1587", "478-456", true);
//        Paciente paciente9 = new Paciente(11111111, "Carla Funes", "Sarmiento 569", "100-456", true);
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
//        Paciente paciente = new Paciente(1, 22221111, "Gomez Pablo", "2332 Colon", "456-123", false);
//        pacData.modificarPaciente(paciente);

        // Consulta de un paciente
//        Paciente paciente = pacData.buscarPacientePorDni(22221111);
//        System.out.println(paciente.toString());

        /**
         * ---------------------------------------------------------------------
         * Probando DietaData
         * ---------------------------------------------------------------------
         */

        // Guardar dietas
        DietaData dietaData = new DietaData();
//        Dieta dieta1 = new Dieta("Masiva", pacData.buscarPacientePorId(3), 150.52, 98.00, LocalDate.of(2023, 8, 23), LocalDate.of(2023, 12, 23), true);
//        Dieta dieta2 = new Dieta("Liviana", pacData.buscarPacientePorId(4), 150.52, 98.00, LocalDate.of(2023, 8, 23), LocalDate.of(2023, 12, 23), true);
//        Dieta dieta3 = new Dieta("Normal", pacData.buscarPacientePorId(5), 150.52, 98.00, LocalDate.of(2023, 8, 23), LocalDate.of(2023, 12, 23), true);
//        dietaData.guardarDieta(dieta1);
//        dietaData.guardarDieta(dieta2);
//        dietaData.guardarDieta(dieta3);
        
        // Eliminar dieta
//        dietaData.eliminarDietaPorId(5);

        // Modificar dieta
//        Dieta dieta = new Dieta(5, "Masiva", pacData.buscarPacientePorId(3), 100.52, 75.50, LocalDate.of(2023, 5, 23), LocalDate.of(2023, 11, 23), true);
//        dietaData.modificarDieta(dieta);

        // Buscar dieta por paciente
//        System.out.println(dietaData.buscarDietaporIdPaciente(3));
    }
}
