
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class medianumerospositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== WHILE ===");
        int numero;
        int suma = 0, contador = 0;

        System.out.print("Ingresa un número positivo (negativo para terminar): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.print("Ingresa otro número (negativo para terminar): ");
            numero = scanner.nextInt();
        }

        if (contador > 0) {
            System.out.println("La media de los números positivos es: " + (double)suma / contador);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        System.out.println("\n=== DO WHILE ===");
        suma = 0;
        contador = 0;
        do {
            System.out.print("Ingresa un número positivo (negativo para terminar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            System.out.println("La media de los números positivos es: " + (double)suma / contador);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        System.out.println("\n=== FOR ===");
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();
        suma = 0;
        contador = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Número negativo detectado, se detiene el conteo.");
                break;
            }
        }

        if (contador > 0) {
            System.out.println("La media de los números positivos es: " + (double)suma / contador);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}
