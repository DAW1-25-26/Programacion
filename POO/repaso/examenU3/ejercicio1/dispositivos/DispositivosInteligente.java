package POO.repaso.examenU3.ejercicio1.dispositivos;

public abstract class DispositivosInteligente {
    
    private String id;
	private boolean encendido;
	
	
	public String getId() {
		return id;
	}


	public boolean getEncendido() {
		return encendido;
	}


	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}


	public DispositivosInteligente(String id) {
		this.id = id;
		this.encendido = false;
	}
	
	public void encender() {
		if (this.encendido==false) {
			this.encendido=true;
		}
	}
    
	public void apagar() {
		if (this.encendido==true) {
			this.encendido=false;
		}
	}
	
	public abstract void detallesDispositivo();

}
