package POO.repaso.ejercicio1;

public abstract class VehiculoPublico {

    private String matriucla;
    private boolean enServicio;
    
    public VehiculoPublico(String matricula){

        this.matriucla = matricula;
        this.enServicio = false;

    }

    public String getMatriucla() {
        return matriucla;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void activar(){
        this.enServicio = true;
    }

    public void desactivar(){
        this.enServicio = false;
    }

    public abstract void mostrarDetalles();
        
}
