package POO.repaso.examenU4.ejercicio1;

public class Revista extends Material implements Prestable {

    private String ISNN;
    private boolean prestado;
    
    public Revista(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.ISNN = ISNN;
        this.prestado = true;
    }

    @Override
    public String toString() {
        return super.toString() + "ISNN: " + this.ISNN;
    }

    public void describirMaterial(){

        System.out.println(this.toString());
    }

    @Override
    public void prestar() {
        
        if (!this.prestado) {
            this.prestado = true;
        }
    }

    @Override
    public void devolver() {
        if (this.prestado) {
            this.prestado = false;
        }
    }

    @Override
    public boolean estaPrestado() {
        if (this.prestado) {
            this.prestado = true;
        }
        return prestado;
    }    
    
}
