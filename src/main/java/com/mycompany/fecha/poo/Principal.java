package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    // TODO: Aquí va el código de la clase Principal

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el día, mes y año
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();

        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt();

        System.out.println("Introduce el año:");
        int año = scanner.nextInt();

        // Crear el objeto Fecha
        Fecha fecha = new Fecha(dia, mes, año);

        // Imprimir si la fecha es válida
        if (fecha.validarFecha()) {
            System.out.println("La fecha es válida.");
            // Imprimir el formato de fecha larga
            System.out.println(fecha.fechaLarga());
        } else {
            System.out.println("La fecha no es válida.");
        }

        scanner.close();
    }
}
