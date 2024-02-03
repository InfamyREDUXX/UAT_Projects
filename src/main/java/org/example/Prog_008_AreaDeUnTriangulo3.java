package org.example;
import java.util.Scanner;
public class Prog_008_AreaDeUnTriangulo3 {

    public static void main(String[] args){
            // Verdadera calculadora del área de un triángulo
            double base, altura, area;
            Scanner in = new Scanner(System.in);

            System.out.println("Area de un triángulo");

            System.out.println("Introduce el valor de la base: ");
            base = in.nextDouble();

            System.out.println("Introduce el valor de la altura: ");
            altura = in.nextDouble();

            area = (altura * base) / 2;

            System.out.println("El área del triángulo es: " + area);
    }
}