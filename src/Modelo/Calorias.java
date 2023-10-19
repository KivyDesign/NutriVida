package Modelo;

public class Calorias {
    int idCalorias;
    int idGrupoAlimenticio;
    String nombre;
    int calorias;
    int proteinas;
    int grasa;
    int carbohidratos;
    int fibra;
    int colesterol;
    Boolean estado;

    public Calorias() {
    }
    
    public Calorias(int calorias) {
        this.calorias = calorias;
    }

    public Calorias(int idGrupoAlimenticio, String nombre, int calorias, int proteinas, int grasa, int carbohidratos, int fibra, int colesterol, Boolean estado) {
        this.idGrupoAlimenticio = idGrupoAlimenticio;
        this.nombre = nombre;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasa = grasa;
        this.carbohidratos = carbohidratos;
        this.fibra = fibra;
        this.colesterol = colesterol;
        this.estado = estado;
    }

    public Calorias(int idCalorias, int idGrupoAlimenticio, String nombre, int calorias, int proteinas, int grasa, int carbohidratos, int fibra, int colesterol, Boolean estado) {
        this.idCalorias = idCalorias;
        this.idGrupoAlimenticio = idGrupoAlimenticio;
        this.nombre = nombre;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasa = grasa;
        this.carbohidratos = carbohidratos;
        this.fibra = fibra;
        this.colesterol = colesterol;
        this.estado = estado;
    }

    public int getIdCalorias() {
        return idCalorias;
    }

    public void setIdCalorias(int idCalorias) {
        this.idCalorias = idCalorias;
    }

    public int getIdGrupoAlimenticio() {
        return idGrupoAlimenticio;
    }

    public void setIdGrupoAlimenticio(int idGrupoAlimenticio) {
        this.idGrupoAlimenticio = idGrupoAlimenticio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public int getGrasa() {
        return grasa;
    }

    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    public int getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public int getFibra() {
        return fibra;
    }

    public void setFibra(int fibra) {
        this.fibra = fibra;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Calorias{" + "idCalorias=" + idCalorias + ", idGrupoAlimenticio=" + idGrupoAlimenticio + ", nombre=" + nombre + ", calorias=" + calorias + ", proteinas=" + proteinas + ", grasa=" + grasa + ", carbohidratos=" + carbohidratos + ", fibra=" + fibra + ", colesterol=" + colesterol + ", estado=" + estado + '}';
    }

}
