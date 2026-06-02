package collections.ejercicios.ejercicio15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        
        Empleado e1 = new Empleado("11111111A", "Hugo", "Alvarez", 1390.50);
        Empleado e2 = new Empleado("22222222B", "Maria", "Perez", 1236.00);
        Empleado e3 = new Empleado("33333333C", "Antonio", "Gutierrez", 1493.50);
        Empleado e4 = new Empleado("44444444D", "Miguel", "Torres", 1500.00);
        Empleado e5 = new Empleado("55555555E", "Manuel", "Gonzalez", 1800.00);
        Empleado e6 = new Empleado("66666666F", "Ana", "Alvarez", 2100.00);     
        Empleado e7 = new Empleado("77777777G", "Carlos", "Perez", 1150.00);
        Empleado e8 = new Empleado("88888888H", "Lucia", "Fernandez", 1350.00);
        Empleado e9 = new Empleado("99999999I", "David", "Martinez", 1650.00);
        Empleado e10 = new Empleado("00000000J", "Elena", "Sanz", 2400.00);

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        listaEmpleados.add(e6);
        listaEmpleados.add(e7);
        listaEmpleados.add(e8);
        listaEmpleados.add(e9);
        listaEmpleados.add(e10);

        System.out.println("Antes del incremento:");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }

        Map<String, String> mapaPuestos = new HashMap<>();

        mapaPuestos.put(e1.getDni(), "Programador");
        mapaPuestos.put(e2.getDni(), "Analista");
        mapaPuestos.put(e3.getDni(), "Programador");
        mapaPuestos.put(e4.getDni(), "Disenador");
        mapaPuestos.put(e5.getDni(), "Programador");
        mapaPuestos.put(e6.getDni(), "Analista");
        mapaPuestos.put(e7.getDni(), "Programador");
        mapaPuestos.put(e8.getDni(), "Disenador");
        mapaPuestos.put(e9.getDni(), "Programador");
        mapaPuestos.put(e10.getDni(), "Analista");

        Iterator<Empleado> it = listaEmpleados.iterator();
        while (it.hasNext()) {
            Empleado emp = it.next();
            String puesto = mapaPuestos.get(emp.getDni());
            if ("Programador".equals(puesto)) {
                Double nuevoSalario = emp.getSalario() * 1.1;
                emp.setSalario(nuevoSalario);
            }
        }

        System.out.println("Despues del incremento:");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }
    }

}
