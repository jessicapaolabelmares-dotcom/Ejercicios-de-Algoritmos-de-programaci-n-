
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class calculadorabasicaconmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        System.out.println("=== Calculadora Básica (WHILE) ===");
        opcion = -1;
        while (opcion != 5) {
            System.out.println("\nMenú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1: resultado = num1 + num2; break;
                    case 2: resultado = num1 - num2; break;
                    case 3: resultado = num1 * num2; break;
                    case 4: 
                        if (num2 != 0) resultado = num1 / num2;
                        else { System.out.println("Error: División entre cero."); continue; }
                        break;
                    default: resultado = 0;
                }
                System.out.println("Resultado: " + resultado);
            }
        }
        System.out.println("\n=== Calculadora Básica (DO WHILE) ===");
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1: resultado = num1 + num2; break;
                    case 2: resultado = num1 - num2; break;
                    case 3: resultado = num1 * num2; break;
                    case 4: 
                        if (num2 != 0) resultado = num1 / num2;
                        else { System.out.println("Error: División entre cero."); continue; }
                        break;
                    default: resultado = 0;
                }
                System.out.println("Resultado: " + resultado);
            }
        } while (opcion != 5);

        System.out.println("\n=== Calculadora Básica (FOR - 3 operaciones fijas) ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nOperación #" + i);
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            System.out.print("Ingresa el primer número: ");
            num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1: resultado = num1 + num2; break;
                case 2: resultado = num1 - num2; break;
                case 3: resultado = num1 * num2; break;
                case 4: 
                    if (num2 != 0) resultado = num1 / num2;
                    else { System.out.println("Error: División entre cero."); continue; }
                    break;
                default: resultado = 0;
            }
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
