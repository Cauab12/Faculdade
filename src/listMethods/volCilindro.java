package listMethods;

import java.util.Scanner;

public class volCilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva o raio da base e a altura do cilindro p/ calcular seu volume: ");
        double rC = sc.nextDouble();
        double altC = sc.nextDouble();

        System.out.println("volume do cilindro: " + volumeCilindro(rC, altC));
    }

    public static double volumeCilindro(double raioDaBase, double altura) {
        return Math.PI * Math.pow(raioDaBase, 2) * altura;
    }
}

