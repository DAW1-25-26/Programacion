package POO.ejercicios.ejercicio5;

public class GestorEmpleado {
    
    static Empleado[] plantilla = new Empleado[10];
    static int numeroEmpleados;

    public GestorEmpleado(){

        this.numeroEmpleados =0;

    }

    public void agregarEmpleado(Empleado nuevoEmpleado){
 
        plantilla[numeroEmpleados] = nuevoEmpleado;
        numeroEmpleados++; 

    }

    public void mostrarEmpleados(){

        System.out.println("Empleados de la empresa:");
        System.out.println("________________________");
        for (int i = 0; i < this.plantilla.length; i++) {
            if (this.plantilla[i] != null) {
                this.plantilla[i].mostrarInfo();
            }
        
        }

    }

    public static void calcularTotalSalarios(){

        for (int i = 0; i < plantilla.length; i++) {
            
        }

    }

}
