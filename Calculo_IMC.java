package com.mycompany.ejercicios;

import java.util.Scanner;

public class Calculo_IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Ingrese su peso en kilogramos: ");
        peso = entrada.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        entrada.close();
    }
}
