package collections.ejercicios.ejercicio9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        // 2. Añadir objetos de las clases derivadas
        listaProductos.add(new Electronico("Teclado", 45.00, "Logitech"));
        listaProductos.add(new Alimenticio("Leche", 1.20, "20/10/2026"));
        
        // Colocamos dos productos con el mismo precio (45.00) para probar el desempate por nombre
        listaProductos.add(new Electronico("Auriculares", 45.00, "Sony")); 
        
        listaProductos.add(new Alimenticio("Arroz", 0.95, "15/12/2027"));
        listaProductos.add(new Electronico("Ratón", 15.50, "Razer"));

        System.out.println("--- Productos ANTES de ordenar ---");
        for (Producto p : listaProductos) {
            p.imprimirInformacion();
        }

        // 3. Utilizar Collections.sort() para ordenarlos automáticamente usando tu compareTo
        Collections.sort(listaProductos);

        System.out.println("\n--- Productos DESPUÉS de ordenar (Precio -> Nombre) ---");
        // 4. Recorrer la lista ordenada e invocar imprimirInformacion()
        for (Producto p : listaProductos) {
            p.imprimirInformacion();
        }
    }
}
