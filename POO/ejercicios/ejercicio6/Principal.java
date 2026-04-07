package POO.ejercicio6;

public class Principal {
    public static void main(String[] args) {
    
        Estudiante e1 = new Estudiante("Manuael Lopez", 19, 7.8);
        e1.mostrarInformacion();

        Estudiante e2 = new Estudiante();
        e2.mostrarInformacion();  
        e2.setNombre("Antonio Perez"); 
        e2.setEdad(20);
        e2.setNota(9.0);     

    }
    
}
