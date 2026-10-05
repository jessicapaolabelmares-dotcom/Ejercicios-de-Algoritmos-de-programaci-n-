package com.mycompany.ejercicios;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Ingrese la base del rectángulo: ");
        base = entrada.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        entrada.close();
    }
}
