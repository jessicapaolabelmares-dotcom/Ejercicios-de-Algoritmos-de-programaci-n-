
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class factorialnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        long factorialFor = 1;
        for (int i = 1; i <= numero; i++) {
            factorialFor *= i;
        }
        System.out.println("Factorial con for: " + factorialFor);

        long factorialWhile = 1;
        int j = 1;
        while (j <= numero) {
            factorialWhile *= j;
            j++;
        }
        System.out.println("Factorial con while: " + factorialWhile);

        long factorialDoWhile = 1;
        int k = 1;
        if (numero == 0) {
            factorialDoWhile = 1;
        } else {
            do {
                factorialDoWhile *= k;
                k++;
            } while (k <= numero);
        }
        System.out.println("Factorial con do while: " + factorialDoWhile);

        scanner.close();
    }
}
