
package com.mycompany.ejercicios;

import java.util.Scanner;


/**
 *
 * @author jessi
 */
public class conversormonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        double pesos = scanner.nextDouble();

        System.out.println("Elige la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado;
        String moneda;

        switch (opcion) {
            case 1:
                resultado = pesos * 0.055;
                moneda = "USD";
                break;
            case 2:
                resultado = pesos * 0.051;
                moneda = "EUR";
                break;
            case 3:
                resultado = pesos * 2.00; 
                moneda = "THB";
                break;
            case 4:
                resultado = pesos * 8.00;
                moneda = "JPY";
                break;
            case 5:
                resultado = pesos * 75.00;
                moneda = "KRW";
                break;
            case 6:
                resultado = pesos * 0.085;
                moneda = "AUD";
                break;
            case 7:
                resultado = pesos * 0.20;
                moneda = "PEN";
                break;
            case 8:
                resultado = pesos * 0.075;
                moneda = "CAD";
                break;
            case 9:
                resultado = pesos * 2.00;
                moneda = "VES";
                break;
            case 10:
                resultado = pesos * 5.00;
                moneda = "ARS";
                break;
            default:
                System.out.println("Opción inválida. Debes elegir entre 1 y 10.");
                scanner.close();
                return;
        }

        System.out.println(pesos + " MXN equivalen a " + resultado + " " + moneda);

        scanner.close();
    }
}
