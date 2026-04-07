package POO.repaso.ejercicio2.Main;

import POO.repaso.ejercicio2.Estudiantes.Estudiante;
import POO.repaso.ejercicio2.Estudiantes.Registro;
import POO.repaso.ejercicio2.Registro.ControlActividad;

public class AppRegistro {

    public static void main(String[] args) {

        Registro [] semana1 = new Registro[7];
        
        semana1[0] = new Registro(2, 4);
        semana1[1] = new Registro(4, 1);
        semana1[2] = new Registro(1, 2);
        semana1[3] = new Registro(2, 2);
        semana1[4] = new Registro(3, 2);
        semana1[5] = new Registro(2, 6);
        semana1[6] = new Registro(3, 3);

        Estudiante e1 = new Estudiante("Francisco Lopez", semana1);

        Registro [] semana2 = new Registro[7]

        Estudiante [] estudiantes = new Estudiante[3];

        ControlActividad.procesarEstudiantes(estudiantes);
    }
    
}
