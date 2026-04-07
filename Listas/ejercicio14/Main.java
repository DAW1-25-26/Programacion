package Listas.ejercicio14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListResourceBundle;

public class Main {
    
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Manuel", "Gonzalez", 1800.0);
        Empleado e2 = new Empleado("Miguel", "Torres", 1500.0);
        Empleado e3 = new Empleado("Maria", "Perez", 1200.0);
        Empleado e4 = new Empleado("Antonio", "Gutierrez", 1450.0);

        List<Empleado> plantilla = new ArrayList<>();
        plantilla.add(e1);
        plantilla.add(e2);
        plantilla.add(e3);
        plantilla.add(e4);

        Iterator<Empleado> it = plantilla.iterator();
        while(it.hasNext()){
            Empleado temp = it.next();
            if (temp.getSalario()<1500.0) {
                Double nuevoSalario = temp.getSalario()*1.03;
                temp.setSalario(nuevoSalario);
            }
        }
    }
}
