package collections.ejercicios.ejercicio8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiante = new ArrayList<>();

        Estudiante e1 = new Estudiante("Jose", 9.00);
        listaEstudiante.add(e1);
        Estudiante e2 = new Estudiante("Saul", 8.50);
        listaEstudiante.add(e2);
        Estudiante e3 = new Estudiante("Ale", 8.00);
        listaEstudiante.add(e3);
        Estudiante e4 = new Estudiante("Carlos", 8.00);
        listaEstudiante.add(e4);
        Estudiante e5 = new Estudiante("Mario", 6.50);
        listaEstudiante.add(e5);

        Collections.sort(listaEstudiante);

        System.out.println("Lista ordenada:");
        for (Estudiante e : listaEstudiante) {
            System.out.println(e);
        }
    }
    

}
