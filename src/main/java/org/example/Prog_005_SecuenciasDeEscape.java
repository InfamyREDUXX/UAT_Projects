package org.example;

public class Prog_005_SecuenciasDeEscape {
    public static void main(String[] args) {
        // Secuencias de escape en Java

        // Nueva línea
        System.out.println("Secuencia de escape para nueva línea: \\n");
        System.out.println("Esta línea está arriba.\nEsta línea está abajo.");

        // Tabulación
        System.out.println("\nSecuencia de escape para tabulación: \\t");
        System.out.println("Esta es una\t\t\ttabulación.");

        // Retroceso
        System.out.println("\nSecuencia de escape para retroceso: \\b");
        System.out.println("123456789\b0"); // Retrocede y reemplaza 9 con 0

        // Retorno de carro
        System.out.println("\nSecuencia de escape para retorno de carro: \\r");
        System.out.println("123456\rabcdef"); // Regresa al inicio y reemplaza los números

        // Comilla simple
        System.out.println("\nSecuencia de escape para comilla simple: \\'");
        System.out.println("Esto es una comilla simple: \'");

        // Comilla doble
        System.out.println("\nSecuencia de escape para comilla doble: \\\"");
        System.out.println("Esto es una comilla doble: \"");

        // Contrabarra
        System.out.println("\nSecuencia de escape para contrabarra: \\\\");
        System.out.println("Esto es una contrabarra: \\");

        // Unicode
        System.out.println("\nSecuencia de escape para Unicode: \\uXXXX");
        System.out.println("Esto es una cara sonriente en Unicode: \u263A");
    }
}