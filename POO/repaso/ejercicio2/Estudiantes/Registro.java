package POO.repaso.ejercicio2.Estudiantes;

public class Registro {

    private int horasEstudio;
    private int horasOcio;

    public Registro(int horasEstudio, int horasOcio) {
        this.horasEstudio = horasEstudio;
        this.horasOcio = horasOcio;
    }

    public int getHorasEstudio() {
        return horasEstudio;
    }

    public int getHorasOcio() {
        return horasOcio;
    } 

    public int calcularHorasTotales(){
        return (this.horasEstudio + this.horasOcio);
    }

}
