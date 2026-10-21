
package com.mycompany.ejercicios;
import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class convertidorgrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Elige la conversión:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = (celsius * 9/5) + 32;
                System.out.println(celsius + " °C equivalen a " + resultado + " °F");
                break;
            case 2:
                resultado = celsius + 273.15;
                System.out.println(celsius + " °C equivalen a " + resultado + " K");
                break;
            default:
                System.out.println("Opción inválida. Debes elegir 1 o 2.");
        }

        scanner.close();
    }
}
