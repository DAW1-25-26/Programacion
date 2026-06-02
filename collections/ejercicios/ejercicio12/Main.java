package collections.ejercicios.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(-12);
        listaNumeros.add(0);
        listaNumeros.add(23);
        listaNumeros.add(-4);
        listaNumeros.add(8);
        listaNumeros.add(-1);

        ListIterator<Integer> it = listaNumeros.listIterator();

        while (it.hasNext()) {
            if (it.next() < 0) {
                it.remove();
            }
        }

        for (Integer i : listaNumeros) {
            System.out.println(i);
        }
    }
}
