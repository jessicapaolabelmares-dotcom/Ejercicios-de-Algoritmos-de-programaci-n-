
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class contarletras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        int contadorFor = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contadorFor++;
            }
        }
        System.out.println("[FOR] La letra 'a' aparece " + contadorFor + " veces.");

        int contadorWhile = 0;
        int j = 0;
        while (j < palabra.length()) {
            if (palabra.charAt(j) == 'a' || palabra.charAt(j) == 'A') {
                contadorWhile++;
            }
            j++;
        }
        System.out.println("[WHILE] La letra 'a' aparece " + contadorWhile + " veces.");


        int contadorDoWhile = 0;
        int k = 0;
        if (palabra.length() > 0) {
            do {
                if (palabra.charAt(k) == 'a' || palabra.charAt(k) == 'A') {
                    contadorDoWhile++;
                }
                k++;
            } while (k < palabra.length());
        }
        System.out.println("[DO WHILE] La letra 'a' aparece " + contadorDoWhile + " veces.");

        scanner.close();
    }
}
    