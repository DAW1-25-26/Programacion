package POO.repaso.examenU3.ejercicio1.dispositivos;

import POO.repaso.examenU3.ejercicio1.funcionalidades.Ajustable;

public class BombillaInteligente extends DispositivosInteligente implements Ajustable {

    private int brillo;

    public BombillaInteligente(String id) {
        super(id);
        this.brillo = -1;
    }

    

    @Override
    public void encender() {
        if (this.getEncendido()==false && this.brillo == -1) {
            this.setEncendido(true);
            this.brillo=50;
        } else if (this.getEncendido()==false && this.brillo<=100 && this.brillo>0) {
            this.setEncendido(true);
        }

        if (this.getEncendido()==true) {
            System.out.println("LA BOMBILLA SE HA ENCENDIDO CON BRILLO " + this.brillo);
        } else {
            System.out.println("LA BOMBILLA YA ESTABA ENCENDIDA CON BRILLO " + this.brillo);
        }
    }



    @Override
    public void ajustar(int nivel) {
        if (this.getEncendido()==false) {
            System.out.println("BOMBILLA APAGADA. Hay que encender la bombilla primero");
        } else {
            if (nivel>0 && nivel<=100) {
                this.brillo = nivel;
                System.out.println("BOMBILLA AJUSTADA A BRILLO " + nivel);
            } else{
                System.out.println("NIVEL DE BRILLO INCORRECTO");
            }
        }
    }

    @Override
    public void detallesDispositivo() {
        String estado = "APAGADO";
        int brilloSalida = this.brillo;
        if (this.getEncendido()) {
            estado = "ENCENDIDO";
        }

        if (this.brillo == -1) {
            brilloSalida = 0;
        }

        System.out.println("BOMBILLA " + this.getId() + " - " + estado + " - Brillo: " + brilloSalida);
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Bombilla inteligente " + this.getId() + " APAGADO");
    }
    
}
