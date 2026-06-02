package collections.ejercicios.ejercicio8;

public class Estudiante implements Comparable<Estudiante>{

    private String nombre;
    private Double nota;

    public Estudiante(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public int compareTo(Estudiante otro) {
        return Double.compare(otro.nota, this.nota);
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Double getNota() {
        return nota;
    }



    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", nota=" + nota + "]";
    }
    
}
