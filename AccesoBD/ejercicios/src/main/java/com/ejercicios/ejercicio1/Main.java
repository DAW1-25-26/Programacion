package com.ejercicios.ejercicio1;

import java.beans.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca edad minima: ");
        int edadMinima = teclado.nextInt();
        System.out.println("Introduzca edad maxima:");
        int edadMaxima = teclado.nextInt();
    }
}