package collections.ejercicios.ejercicio9;

public class Electronico extends Producto {

    private String marca;

    public Electronico(String nombre, Double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("[Electrónico] ID: " + getIdentificador() + 
                           " | Nombre: " + getNombre() + 
                           " | Precio: " + getPrecio() + "€" +
                           " | Marca: " + marca);
    }
    
}
