package POO.ejercicios.ejercicio5;

public class Principal {
    
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("11223344A", "Antonio Lopez", "Programador", 1800);
        Empleado e2 = new Empleado("55667788B", "Francisco Perez", "Analista", 2100);

        GestorEmpleado ge = new GestorEmpleado();
        ge.agregarEmpleado(e1);
        ge.agregarEmpleado(e2);


        GestorEmpleado.calcularTotalSalarios();

    }

}
