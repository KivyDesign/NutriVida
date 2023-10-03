package Modelo;

public class Paciente {
    private int idPaciente;
    private int dni;
    private String nombre;
    private String domicilio;
    private String telefono;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(int idPaciente, int dni, String nombre, String domicilio, String telefono, boolean estado) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Paciente(int dni, String nombre, String domicilio, String telefono, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", dni=" + dni + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
    
}
