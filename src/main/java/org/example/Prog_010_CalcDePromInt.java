package main.java.org.example;
import java.util.Scanner;
public class Prog_010_CalcDePromInt {
    // Calculadora de promedios a 3 números enteros

    private static void println(String message){
        System.out.println(message);
    }
    public static void main(String[] args) {

        int n1, n2, n3, prom;
        Scanner in = new Scanner(System.in);

        println("Calculadora de promedios enteros");

        println("Introduce el primer número: ");
        n1 = in.nextInt();

        println("Introduce el segundo número: ");
        n2 = in.nextInt();

        println("Introduce el tercer número: ");
        n3 = in.nextInt();

        prom = (n1 + n2 + n3) / 3;

        println("El promedio es: " + prom);
    }
}
