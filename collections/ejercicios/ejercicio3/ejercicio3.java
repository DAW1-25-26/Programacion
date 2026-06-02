package collections.ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.HashSet;

public class ejercicio3 {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Hola");
        palabras.add("Nombre");
        palabras.add("Pais");
        palabras.add("Pais");
        palabras.add("Pais");
        palabras.add("Apellido");
        palabras.add("Curso");
        palabras.add("Teclado");
        palabras.add("Monitor");

        for (String p : palabras) {
            System.out.println(p);
        }

        HashSet<String> palabrasUnicas = new HashSet<>(palabras);
        System.out.println("HashSet: " + palabrasUnicas);

    }
}
