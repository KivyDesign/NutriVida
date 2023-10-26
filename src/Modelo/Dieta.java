package Modelo;

import java.time.LocalDate;

public class Dieta {
    private int idDieta;
    private String nombre;
    private Paciente paciente;
    private double pesoInicial;
    private double pesoFinal;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private boolean estado;

    public Dieta() {
    }

    public Dieta(int idDieta, String nombre, Paciente paciente, double pesoInicial, double pesoFinal, LocalDate fechaInicial, LocalDate fechaFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, Paciente paciente, double pesoInicial, double pesoFinal, LocalDate fechaInicial, LocalDate fechaFinal, boolean estado) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", nombre=" + nombre + ", paciente=" + paciente + ", pesoInicial=" + pesoInicial + ", pesoFinal=" + pesoFinal + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", estado=" + estado + '}';
    }
}
