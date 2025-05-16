package listaMetodos;

import java.util.Scanner;

public class SuperficiePiramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("Base e Altura p/ calcular a superfície de uma piramide: ");
        base = sc.nextDouble();
        altura = sc.nextDouble();

        double superficiaPiramide = supPiramide(base, altura);
        System.out.println("Área da superfície: " + superficiaPiramide + " unidades²");
    }

    public static double supPiramide(double base, double altura) {
        return (base * base) + 2 * base * altura;
    }
}
