package POO.ejercicios.ejercicio5;

public class Empleado {
    
    String nombre;
    String dni;
    String puesto;
    double salario;

    public Empleado(String dni, String nombre, String puesto, double salario){

        this.dni =  dni;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public String toString(){
        return "Empleado [nombre=" + nombre + ", dni=" + dni + ", puesto=" + puesto + ", salario=" + salario + "]";
    }

    public void mostrarInfo(){
        System.out.println(this.toString());
    }

}
