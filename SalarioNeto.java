package com.mycompany.ejercicios;

import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioBruto;
        double porcentajeImpuestos;
        double deduccionesAdicionales;
        double impuesto;
        double salarioNeto;

        System.out.print("Ingrese el salario bruto mensual: ");
        salarioBruto = entrada.nextDouble();

        System.out.print("Ingrese el porcentaje de impuestos: ");
        porcentajeImpuestos = entrada.nextDouble();

        System.out.print("Ingrese las deducciones adicionales: ");
        deduccionesAdicionales = entrada.nextDouble();

        impuesto = salarioBruto * (porcentajeImpuestos / 100);

        salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Salario neto: $" + salarioNeto);

        entrada.close();
    }
}
