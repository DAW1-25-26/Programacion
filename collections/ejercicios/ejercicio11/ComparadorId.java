package collections.ejercicios.ejercicio11;

import java.util.Comparator;

public class ComparadorId implements Comparator<Producto>{

    @Override
    public int compare(Producto o1, Producto o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
    
}
