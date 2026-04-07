package POO.repaso.examenU4.ejercicio1;

public class Gestorprestamos {
    
    public void prestarMaterial(Prestable p){

        if (!estaPrestado(p)) {
            p.prestar();
            System.out.println("Material prestado exitosamente");
        }
    }

    public void devolverMaterial(Prestable p){
        if (!p.estaPrestado()) {
            p.devolver();
            System.out.println("Material devuelto exitosamente");
        } else {
            System.out.println("No se puede devolver el material, no esta prestado");
        }
    }

    public boolean estaPrestado(Prestable p){
        return p.estaPrestado();
    }

}
