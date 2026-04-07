package POO.ejercicios.ejercicio3;

public class Principal {

    public static void main(String[] args) {
        
        Libro l1 = new Libro("Cien anos de soledad", 19.00, "Gabriel Garcia Marquez");
        Libro l2 = new Libro("El senor de los anillos", 25.00, "J.R.R Tolkien");
        Libro l3 = new Libro("El capitan Alatriste", 20.00 , "Arturo Perez Reverte");

        TiendaLibros t1 = new TiendaLibros("FNAC");

        l1.mostrarInfo();
        t1.agregarLibro(l1);
        t1.agregarLibro(l2);
        t1.agregarLibro(l3);

        t1.mostrarCatalogo();
    }
    
}
