package POO.ejercicios.ejercicio1;

public class Rectangulo {
    
    int ancho;
    int alto;

    public Rectangulo(int a, int al){

        ancho = a;
        alto = al;
    }

    public void area(){
        System.out.println("El area del rectangulo es: " + (ancho*alto) + " u");
    }

    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: " + (ancho*2 + alto*2) + " u");
    }

}
