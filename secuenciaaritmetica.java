
package com.mycompany.ejercicios;
import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class secuenciaaritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número de la secuencia: ");
        int primero = scanner.nextInt();

        System.out.print("Ingresa la diferencia: ");
        int diferencia = scanner.nextInt();

        System.out.print("Ingresa el número máximo: ");
        int maximo = scanner.nextInt();

        int actual = primero;
        System.out.println("\nSecuencia aritmética:");
        do {
            System.out.print(actual + " ");
            actual += diferencia; 
        } while (actual <= maximo);

        scanner.close();
    }
}
