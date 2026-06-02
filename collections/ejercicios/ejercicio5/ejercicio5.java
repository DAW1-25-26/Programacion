package collections.ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] partes = frase.split(" ");

        ArrayList<String> palabras = new ArrayList<>();
        for (String p : partes) {
            palabras.add(p);
        }

        Iterator<String> it = palabras.iterator();

        while (it.hasNext()) {
            String palabra = it.next();

            if (palabra.toLowerCase().contains("a")) {
                it.remove();
            }
        }

        System.out.println(palabras);
    }
}
