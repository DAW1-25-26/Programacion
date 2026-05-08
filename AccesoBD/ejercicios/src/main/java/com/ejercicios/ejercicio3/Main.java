package com.ejercicios.ejercicio3;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.ejercicios.conectorBD.ConectorBaseDatos;
import com.ejercicios.ejercicio1.Empleado;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        ConectorBaseDatos conector = new ConectorBaseDatos();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dni: ");
        String dni = sc.nextLine();

        System.out.println("Introduzca la nueva edad: ");
        int edad = sc.nextInt();

        String sentenciaModificacion = "UPDATE empleados set edad=? where dni=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sentenciaModificacion);
            ps.setInt(1, edad);
            ps.setString(2, dni);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Tabla modificado sin problemas");
            } else {
                System.out.println("No se han modificado los datos");
            }
            String consulta = "SELECT * FROM empleados where dni=?";
            PreparedStatement ps2 = conn.prepareStatement(consulta);
            ps2.setString(1, dni);
            ResultSet rs = ps2.executeQuery();
            Empleado e = new Empleado(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("edad"));
            ObjectMapper mapeador = new ObjectMapper();
            File archivoSalida1 = new File("usuario");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
