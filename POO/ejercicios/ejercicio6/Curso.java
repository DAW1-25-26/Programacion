package POO.ejercicio6;

public class Curso {
    
    Estudiante [] estudiantes;
    int cantidadAprobados;
    int posicionInsercion;

    public Curso(){
        this.estudiantes = new Estudiante[10];
        this.cantidadAprobados = 0;
        this.posicionInsercion = 0;
    }

    public Estudiante[] getEstudiantes(){
        return this.estudiantes;
    }

    public int getCantidadAprobados(){
        return this.cantidadAprobados;
    }

    public void agregarEstudiante(Estudiante e){
        this.estudiantes[posicionInsercion] = e;
        this.posicionInsercion++;
        if (e.getNota()>5) {
            this.cantidadAprobados++;
        }
    }

}
