package collections.ejercicios.ejercicio14;

public class Empleado {

    private static Integer id = 0;

    private Integer identificador;
    private String nombre;
    private String apellidos;
    private Double salario;

    public Empleado(String nombre, String apellidos, Double salario) {
        id++;
        this.identificador = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    public Integer getIdentificador() {
        return identificador;
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

    @Override
    public String toString() {
        return "Empleado [identificador=" + identificador + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", salario=" + salario + "]";
    }
    
}
