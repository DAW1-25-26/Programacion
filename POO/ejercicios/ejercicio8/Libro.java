package POO.ejercicios.ejercicio8;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion){

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public String getTitulo(String titulo){
        return this.titulo = titulo;
    }

    public String getAutor(String autor){
        return this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnioPublicacion(int anioPublicacion){
        return this.anioPublicacion = anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public boolean getDisponible(boolean disponible){
        return this.disponible = disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void setAutor(String a){
        if (a != null) {
            if (a.length() > 0 && a.length() < 256) {
                this.autor = a;
            }
        }
    }
}
