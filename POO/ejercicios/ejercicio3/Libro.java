package POO.ejercicios.ejercicio3;

public class Libro {
    
    String titulo;
    double precio;
    String autor;

    public Libro(String t, double p, String a){

        titulo = t;
        precio = p;
        autor = a;
    }

    public void mostrarInfo(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Precio: " + precio);
        System.out.println("Autor: " + autor);

    }
}
