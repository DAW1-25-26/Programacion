package POO.repaso.examenU3.ejercicio1.main;
import POO.repaso.examenU3.ejercicio1.dispositivos.*;
import POO.repaso.examenU3.ejercicio1.funcionalidades.*;

public class Main {
 public static void main(String[] args) {

    BombillaInteligente bombilla = new BombillaInteligente("B-001");
    AireAcondicionado aire = new AireAcondicionado("A-001");
    Humificador humidificador = new Humificador("H-001", 2.0);


    DispositivosInteligente[] dispositivos = { bombilla, aire, humidificador };
    Ajustable[] ajustables = { bombilla, aire };


    System.out.println("\n--- Estado inicial ---");
    for (DispositivosInteligente d : dispositivos) {
        d.detallesDispositivo();
    }


    System.out.println("\n--- Encendiendo dispositivos ---");
    for (DispositivosInteligente d : dispositivos) {
        d.encender();
    }


    System.out.println("\n--- Ajustando dispositivos ---");
    ajustables[0].ajustar(80);
    ajustables[1].ajustar(18);


    System.out.println("\n--- Apagando dispositivos ---");
    for (DispositivosInteligente d : dispositivos) {
        d.apagar();
    }


    System.out.println("\n--- Volviendo a encender ---");
    for (DispositivosInteligente d : dispositivos) {
        d.encender();
    }


    humidificador.apagar();
    System.out.println("\n--- Intentando llenar apagado ---");
    humidificador.llenarAgua(2.0);


    humidificador.encender();
    System.out.println("\n--- Llenando correctamente ---");
    humidificador.llenarAgua(2.0);


    System.out.println("\n--- Intentando superar límite ---");
    humidificador.llenarAgua(3.0);


    System.out.println("\n--- Estado final ---");
    for (DispositivosInteligente d : dispositivos) {
        d.detallesDispositivo();
    }
}


}

