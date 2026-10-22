
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class contadordigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("El número tiene 1 dígito.");
            scanner.close();
            return;
        }
        int num = Math.abs(numero);

        int contadorFor = 0;
        for (int n = num; n > 0; n /= 10) {
            contadorFor++;
        }
        System.out.println("[FOR] El número tiene " + contadorFor + " dígitos.");

        int contadorWhile = 0;
        int n2 = num;
        while (n2 > 0) {
            contadorWhile++;
            n2 /= 10;
        }
        System.out.println("[WHILE] El número tiene " + contadorWhile + " dígitos.");

        int contadorDoWhile = 0;
        int n3 = num;
        do {
            contadorDoWhile++;
            n3 /= 10;
        } while (n3 > 0);
        System.out.println("[DO WHILE] El número tiene " + contadorDoWhile + " dígitos.");

        scanner.close();
    }
}
