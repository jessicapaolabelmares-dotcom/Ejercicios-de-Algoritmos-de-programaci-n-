/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglos;
import java.util.Scanner;
/**
 *
 * @author jessi
 */

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = entrada.nextInt();

        int[] numeros = new int[n];

        // Llenar el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("\nArreglo ordenado en forma ascendente siguiendo el ordenamiento burbuja:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}
