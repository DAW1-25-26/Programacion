package POO.repaso.examenU4.ejercicio1;

public class Periodico extends Material {

    private int fechaPublicacion;

    public Periodico(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public String toString(){
        return super.toString() + "fechaPublicacion: " + this.fechaPublicacion;
    }

    @Override
    public void describirMaterial() {
        System.out.println();;
    }
        
}
