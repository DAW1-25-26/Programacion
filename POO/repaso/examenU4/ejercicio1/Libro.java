package POO.repaso.examenU4.ejercicio1;

public class Libro extends Material implements Prestable{
    
    private String ISBN;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion, String iSBN) {
        super(titulo, autor, anioPublicacion);
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "ISBN: " + this.ISBN;
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
