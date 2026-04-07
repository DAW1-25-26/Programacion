package POO.repaso.ejercicio2.Registro;

import POO.repaso.ejercicio2.Estudiantes.Estudiante;

public class ControlActividad {
    
    public static void procesarEstudiantes(Estudiante[] estudiantes){
        for(Estudiante e: estudiantes){
            e.mostrarResumen();
        }
    }
}
