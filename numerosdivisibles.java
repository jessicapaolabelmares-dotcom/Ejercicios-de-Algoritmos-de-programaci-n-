
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class numerosdivisibles {
    public static void main(String[] args) {

        System.out.println("Números divisibles por 3 y 5 (FOR):");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Números divisibles por 3 y 5 (WHILE):");
        int j = 1;
        while (j <= 100) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\n");

        System.out.println("Números divisibles por 3 y 5 (DO WHILE):");
        int k = 1;
        do {
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 100);
        System.out.println();
    }
}
