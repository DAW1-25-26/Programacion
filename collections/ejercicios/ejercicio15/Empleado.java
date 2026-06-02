package collections.ejercicios.ejercicio15;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellidos;
    private Double salario;

    public Empleado(String dni, String nombre, String apellidos, Double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
                + "]";
    }
    
    
}
