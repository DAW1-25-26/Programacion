package POO.ejercicios.ejercicio2;

public class principal {
    
    public static void main(String[] args) {
        
        CuentaBancaria c1 = new CuentaBancaria(0, "Manolo Gutierrez");
        c1.mostrarInfo();
        c1.ingresarDinero(200);
        c1.mostrarInfo();
        c1.retirarDinero(500);
        c1.mostrarInfo();
        c1.retirarDinero(750);
        c1.mostrarInfo();

    }

}
