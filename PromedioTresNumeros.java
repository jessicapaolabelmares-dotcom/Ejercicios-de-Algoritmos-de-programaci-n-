package com.mycompany.ejercicios;

import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, promedio;

        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        num3 = entrada.nextDouble();

        promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio es: " + promedio);

        entrada.close();
    }
}
