package POO.ejercicios.ejercicio2;

public class CuentaBancaria {
    
    double saldo;
    String titular;

    //Constructor
    public CuentaBancaria(double s, String t){

        saldo = s;
        titular = t;
    }

    //Metodos

    public void ingresarDinero(double cantidad){

        saldo = saldo + cantidad;
    }

    public void retirarDinero(double cantidad){

        if(cantidad<=saldo){

            saldo = saldo + cantidad;
        } else {

            System.out.println("ERROR: Saldo insuficiente");
        }
    }

    public void mostrarInfo(){

        System.out.println("Informacion de la cuenta:");
        System.out.println("_________________________");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " €");
    }
}
