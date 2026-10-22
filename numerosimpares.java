
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class numerosimpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int limite = scanner.nextInt();

        if (limite <= 0) {
            System.out.println("Debes ingresar un número mayor que 0.");
        } else {
            int i = 1;
            System.out.println("Números impares desde 1 hasta " + limite + ":");

            do {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= limite);
        }

        scanner.close();
    }
}
