package ExamenU2.ejercicio1;

public class principal {
    
    public static void main(String[] args){

        String [] titulos = {"El Quijote", "Cien años de soledad", "La Fundacion", "El Señor de los Anillos", "1984"};

        boolean disponible = false;
        boolean [] prestados = new boolean[5];

        for(int i=0; i<prestados.length; i++){

            prestados[i] = disponible;

        }

        int opcion = 0;

        while (opcion != 5) {

            opcion = funcionalidades.mostrarMenu();

            if (opcion == 1) {
                
                funcionalidades.mostrarLibros(titulos, prestados);

            } else if (opcion == 2) {

                int indice = funcionalidades.pedirIndiceLibro();
                funcionalidades.prestarLibro(prestados, indice);
                
                
            } else if (opcion == 3) {

                int indice = funcionalidades.pedirIndiceLibro();
                funcionalidades.devolverLibro(prestados, indice);

            } else if (opcion == 4) {

                funcionalidades.contarPrestados(prestados);
                
            }

            System.out.println();

        }     

    }

}
