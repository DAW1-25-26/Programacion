package POO.ejercicios.ejercicio3;

import java.util.Scanner;

public class TiendaLibros {

    String nombre;
    Libro [] catalogo;
    int posicionLibroNuevo;

    public TiendaLibros(String nombre){

        this.nombre = nombre;
        this.catalogo = new Libro[20];
        this.posicionLibroNuevo = 0;
    }
    
    public void agregarLibro(Libro lib){

        this.catalogo[posicionLibroNuevo]= lib;
        this.posicionLibroNuevo++;
    }

    public void mostrarCatalogo(){

        for(int i = 0; i<this.catalogo.length; i++){

            if (this.catalogo[i] != null) {
                this.catalogo[i].mostrarInfo();
            }
        }
    }

    public void BuscarLibro(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un libro a buscar: ");
        String libroBuscado = teclado.nextLine();

        for (int i = 0; i < catalogo.length; i++) {
            if (this.catalogo[i] != null) {
                if (this.catalogo[i].titulo.contains(libroBuscado)) {
                    System.out.println("Libro encontrado");
                }
            }
        }
    }

}
