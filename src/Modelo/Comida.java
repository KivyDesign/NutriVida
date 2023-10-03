package Modelo;

public class Comida {
    private int idComida;
    private String nombre;
    private String detalle;
    int calorias;
    boolean estado;

    public Comida() {
    }

    public Comida(int idComida, String nombre, String detalle, int calorias, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.calorias = calorias;
        this.estado = estado;
    }

    public Comida(String nombre, String detalle, int calorias, boolean estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.calorias = calorias;
        this.estado = estado;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", detalle=" + detalle + ", calorias=" + calorias + ", estado=" + estado + '}';
    }
    
}
