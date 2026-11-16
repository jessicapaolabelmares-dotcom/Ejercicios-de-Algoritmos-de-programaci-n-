
package com.mycompany.arreglos;
import java.util.Scanner; 

/**
 *
 * @author jessi
 */
public class numeromayorymenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];
   
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

      
        int mayor = numeros[0];
        int menor = numeros[0];

  
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        
        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        entrada.close();
    }
}
