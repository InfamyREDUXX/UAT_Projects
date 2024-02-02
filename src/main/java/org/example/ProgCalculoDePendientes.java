package org.example;
import java.util.Scanner;

public class ProgCalculoDePendientes {
    public static void main(String[] args) {
        // Programa que calcula la pendiente de un plano en Java

        double x1, x2, y1, y2, pendiente;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa la primer coordenada X: ");
        x1 = in.nextDouble();

        System.out.println("Ingresa la primer coordenada Y: ");
        y1 = in.nextDouble();

        System.out.println("Ingresa la segunda coordenada X: ");
        x2 = in.nextDouble();

        System.out.println("Ingresa la segunda coordenada Y:");
        y2 = in.nextDouble();

        pendiente = (y2 - y1) / (x2 - x1);

        System.out.println("La pendiente entre los puntos es: " + pendiente);
    }
}
