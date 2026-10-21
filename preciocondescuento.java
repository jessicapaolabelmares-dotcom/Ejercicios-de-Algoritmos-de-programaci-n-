
 
package com.mycompany.ejercicios;
import java.util.Scanner;
/**
 *
 * @author jessi
 */
public class preciocondescuento {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        double precioFinal;
        double descuento = 0;

        if (precioOriginal <= 100) {
            descuento = 0;
        } else if (precioOriginal <= 200) {
            descuento = 0.10; 
        } else if (precioOriginal <= 500) {
            descuento = 0.20; 
        } else {
            descuento = 0.25; 
        }

        precioFinal = precioOriginal - (precioOriginal * descuento);

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);

        scanner.close();
    }
}
 
