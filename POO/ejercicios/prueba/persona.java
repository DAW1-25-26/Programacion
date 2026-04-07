package POO.ejercicios.prueba;

public class persona {

    //Atributos
    String nombre;
    int edad;

    //Constructores
    public persona(String n, int e){

        nombre = n;
        edad = e;
    }

    //Metodos
    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " añoss");
    }
    
}
