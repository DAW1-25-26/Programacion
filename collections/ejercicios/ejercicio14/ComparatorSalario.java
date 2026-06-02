package collections.ejercicios.ejercicio14;

import java.util.Comparator;

public class ComparatorSalario implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return Double.compare(o2.getSalario(), o1.getSalario());
    }
    
}
