
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author german
 */
public class Historial {
  private int idHistorial;
  private Paciente paciente;
  private double peso;
  private LocalDate fechaConsulta;

    public Historial() {
    }

    public Historial(Paciente paciente, double peso, LocalDate fechaConsulta) {
        this.paciente = paciente;
        this.peso = peso;
        this.fechaConsulta = fechaConsulta;
    }

    public Historial(int idHistorial, Paciente paciente, double peso, LocalDate fechaConsulta) {
        this.idHistorial = idHistorial;
        this.paciente = paciente;
        this.peso = peso;
        this.fechaConsulta = fechaConsulta;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHistorial=" + idHistorial + ", paciente=" + paciente + ", peso=" + peso + ", fechaConsulta=" + fechaConsulta + '}';
    }
  
}
