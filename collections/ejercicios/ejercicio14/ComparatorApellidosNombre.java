package collections.ejercicios.ejercicio14;

import java.util.Comparator;

public class ComparatorApellidosNombre implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {

        int resultado = o1.getApellidos().compareTo(o2.getApellidos());
        
        if (resultado != 0) {
            return resultado;
        }

        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
