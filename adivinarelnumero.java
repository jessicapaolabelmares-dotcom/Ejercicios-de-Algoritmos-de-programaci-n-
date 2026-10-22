
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class adivinarelnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intento;

        System.out.println("He pensado un número entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Ingresa tu suposición: ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! El número era " + numeroSecreto);
            }
        } while (intento != numeroSecreto);

        scanner.close();
    }
}
