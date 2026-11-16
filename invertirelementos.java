
package com.mycompany.arreglos;
import java.util.Scanner; 
/**
 *
 * @author jessi
 */
public class invertirelementos {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        // Leer los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar arreglo invertido
        System.out.println("\nArreglo invertido:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}
