package collections.ejercicios.ejercicio9;

import java.sql.Date;

public class Alimenticio extends Producto{

    private String fechaCaducidad;

    public Alimenticio(String nombre, Double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("[Alimento] ID: " + getIdentificador() + 
                           " | Nombre: " + getNombre() + 
                           " | Precio: " + getPrecio() + "€" +
                           " | Caducidad: " + fechaCaducidad);
    }
    
}
