package com.mycompany.ejercicios;

/**
 *
 * @author jessi
 */
import java.util.Scanner;

public class edadparavotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

         if (edad >= 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("No eres elegible para votar. Debes tener al menos 18 años.");
         }

        scanner.close();
    }
}
