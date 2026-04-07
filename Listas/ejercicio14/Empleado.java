package Listas.ejercicio14;

public class Empleado {
    
    static private Integer idAuto = 1;
    private Integer id;
    private String nombre;
    private String apellidos;
    private Double salario;

    public Empleado (String nombre, String apellidos, Double salario){
        this.id = idAuto;
        idAuto++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
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

    
}
