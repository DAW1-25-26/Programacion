package POO.repaso.examenU3.ejercicio1.dispositivos;

import POO.repaso.examenU3.ejercicio1.funcionalidades.Ajustable;

public class Humificador extends DispositivosInteligente {

    private double cantidadAgua;

    public Humificador(String id, double cantidadAgua) {
        super(id);
        if (cantidadAgua > 5) {
            System.out.println("ERROR. Capacidad max 5 l");
        } else if (cantidadAgua < 0) {
            System.out.println("ERROR. Cantidad no valida");
        } else {
            this.cantidadAgua = cantidadAgua;
        }
    }

    public void llenarAgua(double cantidad){
        if (this.getEncendido() == false ) {
            System.out.println("El deposito " + this.getId() + " esta APAGADO");
        } else
        if (cantidad < 0) {
            System.out.println("ERROR. Cantidad no valida");
        } else 
        if (cantidadAgua + cantidad > 5) {
            System.out.println("Limite de agua superado");
        } else {
            this.cantidadAgua = cantidadAgua + cantidad;
            System.out.println("SE HA ANADIDO AGUA CANTIDAD ACTUAL");
        }
    }

    @Override
    public void detallesDispositivo() {
        String estado = "APAGADO";
		if (this.getEncendido()){
			estado="ENCENDIDO";
        }
		System.out.println("HUMIDIFICADOR " + this.getId() + " - " + estado + " - Cantidad de Agua: " + this.cantidadAgua);
	}

    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Humificador " + this.getId() + " APAGADO");
    }

}
