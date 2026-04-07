package POO.ejercicio6;

public class Estudiante {
    
    String nombre;
    int edad;
    double nota;

    public Estudiante(String nombre, int edad, double nota){

        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota; 

    }

    public Estudiante(){}

    String getNombre(){
        return this.nombre;
    }

    int getEdad(){
        return this.edad;
    }

    double getNota(){
        return this.nota;
    }

    public void setNombre(String nuevoNombre){
        if (nuevoNombre != null) {
            if (nuevoNombre.length()<255) {
                this.nombre = nuevoNombre;
            }
        }
    }

    public void setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public void setNota(double nuevaNota){
        if (nuevaNota >= 0.0) {
            this.nota = nuevaNota;
        } else {
            System.out.println("La nota no puede ser negativa.");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Nota: " + this.nota);
    }

    public static boolean aprueba(int nota){
        boolean aprueba = false;
        if (nota >= 5) {
            aprueba = true;
        }

        return aprueba;
    }

    public static boolean esMenorEdad(int edad){
        boolean esMenor = false;
        if (edad<18) {
            esMenor = true;
        }
        return esMenor;
    }

}
