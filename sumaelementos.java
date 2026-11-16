
package com.mycompany.arreglos;

import java.util.Scanner; 
/**
 *
 * @author jessi
 */
public class sumaelementos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

      
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            suma += numeros[i];
        }

        
        System.out.println("\nLa suma total de los elementos es: " + suma);

        entrada.close();
    }
}
