
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class conteonumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();

        int mayores, menores, iguales;

        mayores = menores = iguales = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }
        System.out.println("\n[FOR] Mayores: " + mayores + ", Menores: " + menores + ", Iguales: " + iguales);

        mayores = menores = iguales = 0;
        int j = 1;
        while (j <= cantidad) {
            System.out.print("Ingresa el número " + j + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
            j++;
        }
        System.out.println("\n[WHILE] Mayores: " + mayores + ", Menores: " + menores + ", Iguales: " + iguales);

        mayores = menores = iguales = 0;
        int k = 1;
        do {
            System.out.print("Ingresa el número " + k + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
            k++;
        } while (k <= cantidad);
        System.out.println("\n[DO WHILE] Mayores: " + mayores + ", Menores: " + menores + ", Iguales: " + iguales);

        scanner.close();
    }
}
