package collections.ejercicios.ejercicio14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Main {
    
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Empleado e1 = new Empleado("Manuel", "Gonzalez", 1800.0);
        Empleado e2 = new Empleado("Miguel", "Torres", 1500.0);
        Empleado e3 = new Empleado("Maria", "Perez", 1200.0);
        Empleado e4 = new Empleado("Antonio", "Gutierrez", 1450.0);
        Empleado e5 = new Empleado("Hugo", "Alvarez", 1350.0);
        
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);

        System.out.println("Antes del incremento:");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }

        ListIterator<Empleado> it = listaEmpleados.listIterator();

        while (it.hasNext()) {
            Empleado emp = it.next();
            Double nuevoSalario = emp.getSalario();
            if (nuevoSalario < 1500) {
                nuevoSalario = nuevoSalario * 1.03;
                emp.setSalario(nuevoSalario);
            }
        }

        Collections.sort(listaEmpleados, new ComparatorSalario());

        System.out.println("Despues del incremento y ordenados por salario desc");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }

        Collections.sort(listaEmpleados, new ComparatorApellidosNombre());

        System.out.println("Ordenados por apellidos:");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }


    }
}
