package collections.ejercicios.ejercicio11;

public class Electronico extends Producto {

    private String marca;

    public Electronico(Integer id, String nombre, Double precio, String marca) {
        super(id, nombre, precio);
        this.marca = marca;
    }

    @Override
	public String toString() {
		return super.toString() + ", marca= " + marca;
	}
    
}
