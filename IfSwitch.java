package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class IfSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación de los parciales (0-100): ");
        double parciales = scanner.nextDouble();

        System.out.print("Ingresa la calificación del proyecto (0-100): ");
        double proyecto = scanner.nextDouble();

        System.out.print("Ingresa la calificación del examen final (0-100): ");
        double examenFinal = scanner.nextDouble();

        if ((parciales >= 0 && parciales <= 100) &&
            (proyecto >= 0 && proyecto <= 100) &&
            (examenFinal >= 0 && examenFinal <= 100)) {
                double calificacionFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
                System.out.printf("La calificación final del estudiante es: %.2f%n", calificacionFinal);
        }
        else {
            System.out.println("Error: todas las calificaciones deben estar entre 0 y 100.");
        }
        scanner.close();
    }
   }

     