package collections.ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> random = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numero = (int)(Math.random()*100) + 1;
            random.add(numero);
        }

        System.out.println("Size: " + random.size()); 
        if (random.contains(50) == true) {
            System.out.println("contiene el 50");
        }else{
            System.out.println("no contiene el 50");
        }

        for (Integer num : random) {
            System.out.println(num);
        }
        
        System.out.println("Dame un indice: ");
        int indice = teclado.nextInt();
        random.remove(indice);
        for (Integer num : random) {
            System.out.println(num);
        }

        System.out.print("Dime un elemento que contenga el ArrayList: ");
        int elemento = teclado.nextInt();
        random.remove(Integer.valueOf(elemento));
    }
}
