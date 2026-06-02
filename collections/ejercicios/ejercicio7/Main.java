package collections.ejercicios.ejercicio7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.plaf.PanelUI;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Producto> productos = new HashMap<>();

        Producto p1 = new Producto(1, "Pan", 1.5);
        Producto p2 = new Producto(2, "Leche", 2);
        Producto p3 = new Producto(3, "Caviar", 40);
        Producto p4 = new Producto(4, "Cereales", 3.5);
        Producto p5 = new Producto(5, "Pizza", 4);

        Producto[] listaProducto = {p1, p2, p3, p4, p5};

        for (Producto p : listaProducto) {
            productos.put(p.nombre, p);
        }

        System.out.println("ANTES:");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().precio);
        }      
        
        Iterator<Map.Entry<String, Producto>> it = productos.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Producto> entry = it.next();
            if (entry.getValue().precio < 50) {
                entry.getValue().precio = entry.getValue().precio * 1.10;
            }
        }

        System.out.println("DESPUÉS:");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().precio);
        }
    }
}
