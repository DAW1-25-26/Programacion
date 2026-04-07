package POO.repaso.examenU3.ejercicio1.dispositivos;

import POO.repaso.examenU3.ejercicio1.funcionalidades.Ajustable;

public class AireAcondicionado extends DispositivosInteligente implements Ajustable {

    private int temperaturaActual;

    public AireAcondicionado(String id) {
        super(id);
        this.temperaturaActual = -1;
    }

    public int getTemperaturaActual() {
        return temperaturaActual;
    }

    @Override
    public void ajustar(int nivel) {
        if (this.getEncendido() == false) {
            System.out.println("El aire esta APAGADO, no se puede cambiar la temperatura");
            return;
        }
        if (nivel >= 16 && nivel <= 30) {
            this.temperaturaActual = nivel;
            System.out.println("Aire acondicionado " + this.getId() + " ajustado a " + nivel + "ºC");
        } else {
            System.out.println("Temperatura fuera de rango");
        }
    }

    @Override
    public void detallesDispositivo() {

        String estado = "APAGADO";
        if (this.getEncendido()) {
            estado = "ENCENDIDO";
        }
        System.out.println("AIRE " + this.getId() + " - " + estado + " - Temperatura: " + temperaturaActual);
    }
    

    @Override
    public void encender() {
        if (this.getEncendido()==false ) {

            if (this.temperaturaActual == -1) {
                this.temperaturaActual = 21;
            }

            setEncendido(true);

            System.out.println("Aire Acondicionado " + this.getId() + " ENCENDIDO con temperatura " + temperaturaActual + "ºC.");
        }

    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Aire acondicionado " + this.getId() + " APAGADO");
    }

}
