package com.mycompany.ejercicios;
import java.util.Scanner;
 

/**
 *
 * @author jessi
 */
public class vocalesoconsonantes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("=== WHILE ===");
        System.out.println("Ingresa letras (espacio para terminar):");
        letra = scanner.next().charAt(0);
        while (letra != ' ') {
            if (esVocal(letra)) {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " es una consonante.");
            }
            letra = scanner.next().charAt(0);
        }

        System.out.println("\n=== DO WHILE ===");
        do {
            System.out.print("Ingresa una letra (espacio para terminar): ");
            letra = scanner.next().charAt(0);
            if (letra != ' ') {
                if (esVocal(letra)) {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            }
        } while (letra != ' ');

        System.out.println("\n=== FOR ===");
        System.out.print("¿Cuántas letras deseas ingresar? ");
        int cantidad = scanner.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa la letra " + i + ": ");
            letra = scanner.next().charAt(0);
            if (esVocal(letra)) {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " es una consonante.");
            }
        }

        scanner.close();
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
