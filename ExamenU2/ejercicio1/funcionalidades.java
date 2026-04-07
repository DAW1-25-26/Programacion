package ExamenU2.ejercicio1;

import java.util.Scanner;

public class funcionalidades {
    
    public static int mostrarMenu(){

        Scanner teclado =  new Scanner(System.in);

        System.out.println("Que accion desea realizar");
        System.out.println("1 - Ver estado de los libros");
        System.out.println("2 - Prestar un libro");
        System.out.println("3 - Devolver un libro");
        System.out.println("4 - Mostrar cuantos libros estan prestados");
        System.out.println("5 - Terminar");
        int opcion = teclado.nextInt();

        return opcion;
    }

    public static int pedirIndiceLibro(){

        Scanner teclado =  new Scanner(System.in);

        System.out.println("Que indice quieres elegir?");
        int indice = teclado.nextInt();

        while (indice < 0 || indice > 4) {

            System.out.println("Valor introducido erroneo, vuelve a intentarlo");
            System.out.println("Que indice quieres saber?");
            indice = teclado.nextInt();
        }

        return indice;
    }

    public static void mostrarLibros(String [] titulos, boolean [] prestados){


        for(int i=0; i<titulos.length; i++){
        
            if (prestados[i] == false) {
                
                System.out.println(i + " - " + titulos[i] + " - disponible");

            } else if (prestados[i] == true) {
                
                System.out.println(i + " - " + titulos[i] + " - no disponible");

            }

        }

    }

    public static boolean prestarLibro(boolean[] prestados, int indice){

        if (prestados[indice] == false) {
            
            System.out.println("Libro prestado correctamente");
            prestados[indice] = true;            

        } else if (prestados[indice] == true) {
            
            System.out.println("El libro ya ha sido prestado anteriormente");

        }
        
        return prestados[indice];

    }

    public static boolean devolverLibro(boolean[] prestados, int indice){

        
        if (prestados[indice] == true) {
            
            System.out.println("Libro devuelto correctamente");
            prestados[indice]  = false;

        } else if (prestados[indice] == false) {
            
            System.out.println("El libro ya estaba disponible anteriormente");

        }

        return prestados[indice];
    }

    public static int contarPrestados(boolean[] prestados){

        int contadorPrestados = 0;

        for(int i=0; i<prestados.length; i++){

            if (prestados[i] == true) {
                
                contadorPrestados++;

            }
            
        }

        System.out.println("Libros prestados: " + contadorPrestados);

        return contadorPrestados;
    }

}
