package collections.ejercicios.ejercicio1;

import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {

        int sumaEnteros = 0;
        double sumaDecimales = 0;

        String[] numerosEnteros = {"10", "20", "30", "40"};
        String[] numerosDecimales = {"3.14", "2.718", "1.414"};

        int[] enteros = new int[numerosEnteros.length];
        double[] decimales = new double[numerosDecimales.length];

        for (int i = 0; i < numerosEnteros.length; i++) {
            enteros[i] = Integer.parseInt(numerosEnteros[i]);
            sumaEnteros = sumaEnteros + enteros[i];
        }

        for (int i = 0; i < numerosDecimales.length; i++) {
            decimales[i] = Double.parseDouble(numerosDecimales[i]);
            sumaDecimales = sumaDecimales + decimales[i];
        }

        System.out.println("Suma enteros: " + sumaEnteros);
        System.out.println("Suma decimales: " + sumaDecimales);


        // PARTE B

        ArrayList<Integer> listaEnteros = new ArrayList<>();
        ArrayList<Double> listaDecimales = new ArrayList<>();

        for (int i = 0; i < numerosEnteros.length; i++) {
            int numero = Integer.parseInt(numerosEnteros[i]);
            listaEnteros.add(numero);
        }

        for (int i = 0; i < numerosDecimales.length; i++) {
            double numero = Double.parseDouble(numerosDecimales[i]);
            listaDecimales.add(numero);
        }

        int sumaEntero = 0;
        for (Integer num : listaEnteros) {
            sumaEntero += num;
        }
        int sumaDecimale = 0;
        for (Double num : listaDecimales) {
            sumaDecimale += num;
        }

        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Suma de decimales: " + sumaDecimales);
    }
}
