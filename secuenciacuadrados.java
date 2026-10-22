
package com.mycompany.ejercicios;
import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class secuenciacuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int limite = scanner.nextInt();

        if (limite <= 0) {
            System.out.println("Debes ingresar un número mayor que 0.");
        } else {
 
            System.out.println("\n=== DO WHILE ===");
            int i = 1;
            do {
                System.out.println(i + "^2 = " + (i * i));
                i++;
            } while (i <= limite);

            System.out.println("\n=== WHILE ===");
            int j = 1;
            while (j <= limite) {
                System.out.println(j + "^2 = " + (j * j));
                j++;
            }

            System.out.println("\n=== FOR ===");
            for (int k = 1; k <= limite; k++) {
                System.out.println(k + "^2 = " + (k * k));
            }
        }

        scanner.close();
    }
}
