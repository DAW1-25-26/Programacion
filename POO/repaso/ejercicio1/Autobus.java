package POO.repaso.ejercicio1;

public class Autobus extends VehiculoPublico{
    
    private int capacidad;

    public Autobus(String matricula, int capacidad) {
        super(matricula);
        this.capacidad = capacidad;
    }

    public void activar(){
        super.activar();
        System.out.println("Autobus activado con capacidad para" + this.capacidad + " personas");
    }

    public void mostrarDetalles(){
        System.out.println("Matricula: " + getMatriucla());
        System.out.println("Disponible: " + isEnServicio());
        System.out.println("Capacidad: " + this.capacidad);
    }

}
