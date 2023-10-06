package Controlador;

import java.sql.Connection;

public class HistorialData {

    private Connection con = null;
    private HistorialData historialData;

    public HistorialData() {
        con = Conexion.getConexion();
    }
    public void guardarHistorial(){
    
}
}
