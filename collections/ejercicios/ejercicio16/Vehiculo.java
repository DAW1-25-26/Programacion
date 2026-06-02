package collections.ejercicios.ejercicio16;

public class Vehiculo {

    private String matricula;
    private String marca;
    private Integer anio;
    private String modelo;

    public Vehiculo(String matricula, String marca, String modelo, Integer anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", anio=" + anio + ", modelo=" + modelo + "]";
    }
    
}
