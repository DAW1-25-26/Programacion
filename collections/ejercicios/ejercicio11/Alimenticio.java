package collections.ejercicios.ejercicio11;

import java.sql.Date;

public class Alimenticio extends Producto{

    private String fechaCaducidad;

    public Alimenticio(Integer id, String nombre, Double precio, String fechaCaducidad) {
        super(id, nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
	public String toString() {
		return super.toString() + " - fechaCaducidad: " + fechaCaducidad;
	}
    
}
