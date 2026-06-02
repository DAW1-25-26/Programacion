package collections.ejercicios.ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ejercicio6 {
    public static void main(String[] args) {

        HashMap<String, Double> productos = new HashMap<>();

        String[] nombre = {"Pan", "Leche", "Huevos", "Batido", "Croissant", "Pasta", "Pizza", "Perfume"};
        double[] precio = {1.00, 2.00, 3.00, 4.5, 1.5, 2.5, 5.00, 15.00};

        for (int i = 0; i < nombre.length; i++) {
            productos.put(nombre[i], precio[i]);
        }
        System.out.println(productos);

        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();

            if (entry.getValue() < 50) {
                double nuevoPrecio = entry.getValue() * 1.10;
                entry.setValue(nuevoPrecio);
            }
        }
        System.out.println(productos);
    }
}
