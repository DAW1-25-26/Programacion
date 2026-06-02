package collections.ejercicios.ejercicio13;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Zanahoria");
        listaCadenas.add("manzana");
        listaCadenas.add("Plátano");
        listaCadenas.add("pera");
        listaCadenas.add("Arándano");

        ListIterator<String> it = listaCadenas.listIterator();

        while (it.hasNext()) {
            String elemento = it.next().toUpperCase();
            it.remove();
            it.add(elemento);
        }

        for (String s : listaCadenas) {
            System.out.println(s);
        }
    }
}
