package Modelo;

public class DietaComida {

    private int idDietaComida;
    private Comida comida;
    private Dieta dieta;
    private int porcion;
    private Horario horario;

    public DietaComida() {
    }

    public DietaComida(Comida comida, Dieta dieta, int porcion, Horario horario) {
        this.comida = comida;
        this.dieta = dieta;
        this.porcion = porcion;
        this.horario = horario;
    }

    public DietaComida(int idDietaComida, Comida comida, Dieta dieta, int porcion, Horario horario) {
        this.idDietaComida = idDietaComida;
        this.comida = comida;
        this.dieta = dieta;
        this.porcion = porcion;
        this.horario = horario;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    
    @Override
    public String toString() {
        return "DietaComida{" + "idDietaComida=" + idDietaComida + ", comida=" + comida + ", dieta=" + dieta + '}';
    }

}
