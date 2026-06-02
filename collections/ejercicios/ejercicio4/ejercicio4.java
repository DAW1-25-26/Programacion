package collections.ejercicios.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> mapa = new HashMap<>();
        
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine().toLowerCase().trim();;
        String resultado = frase.replaceAll("\\s+", "");

        for (int i = 0; i < resultado.length(); i++) {
            char c = resultado.charAt(i);
            if (mapa.containsKey(c)) {
                mapa.put(c, mapa.get(c) + 1);
            } else {
                mapa.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
