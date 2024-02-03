package main.java.org.example;
import java.util.Scanner;

public class Prog_009_CalcDeProm {
    // Calculadora de promedios a 3 números con punto decimal
    private static void println(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {

        double n1, n2, n3, prom;
        Scanner in = new Scanner(System.in);

        println("Calculadora de promedios");

        println("Introduce el primer número: ");
        n1 = in.nextDouble();

        println("Introduce el segundo número: ");
        n2 = in.nextDouble();

        println("Introduce el tercer número");
        n3 = in.nextDouble();

        prom = (n1 + n2 + n3) / 3;

        println("El promedio es: " + prom);
    }
}
