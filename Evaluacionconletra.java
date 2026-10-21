package com.mycompany.ejercicios;
import java.util.Scanner;
/**
 *
 * @author jessi
 */
public class Evaluacionconletra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación (0-100): ");
        int calificacion = scanner.nextInt();

        if (calificacion >= 0 && calificacion <= 100) {
            char letra;
            if (calificacion >= 90) {
                letra = 'A';
            } else if (calificacion >= 80) {
                letra = 'B';
            } else if (calificacion >= 70) {
                letra = 'C';
            } else if (calificacion >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }
            System.out.println("La calificación " + calificacion + " corresponde a la letra: " + letra);
        } else {
            System.out.println("Error: la calificación debe estar entre 0 y 100.");
        }

        scanner.close();
    }
}

