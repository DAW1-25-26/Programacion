package collections.ejercicios.ejercicio11;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Producto>{

    @Override
    public int compare(Producto o1, Producto o2) {
        int resultado = Double.compare(o1.getPrecio(), o2.getPrecio());

        if (resultado == 0) {
            resultado = o1.getNombre().compareTo(o2.getNombre());
        }

        return resultado;
    }
    
    
}
