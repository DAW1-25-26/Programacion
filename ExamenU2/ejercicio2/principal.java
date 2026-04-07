package ExamenU2.ejercicio2;

import java.util.Scanner;

public class principal {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int contadorPalabras = 0;

        System.out.print("Frase original: ");
        String frase = teclado.nextLine();


        String SinEspacioDelAtr = frase.trim();

        String[] palabras = SinEspacioDelAtr.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (!palabras[i].equals("")) {
            
            contadorPalabras++;

            }

        }

        System.out.println("Hay " + contadorPalabras + " palabras");

        String[] palabrasReales = new String[contadorPalabras];
        int j = 0;
        for (int i = 0; i < palabras.length; i++) {

            if (!palabras[i].equals("") && !palabras[i].equals(" ")) {
            
            palabrasReales[j] = palabras[i];
            j++;

            }
            
        }

        System.out.print("Frase final: ");

        for (j = 0; j < palabrasReales.length; j++) {

            palabrasReales[j] = palabrasReales[j].substring(0,1).toUpperCase() + palabrasReales[j].substring(1);
            System.out.print(palabrasReales[j] + " ");
            
        }     
        
    }

}
