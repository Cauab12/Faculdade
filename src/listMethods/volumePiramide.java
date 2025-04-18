package listMethods;

import java.util.Scanner;

public class volumePiramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva a area da base da piramide: ");
        double baseP = sc.nextDouble();
        System.out.println("escreva a altura da piramide: ");
        double alturaP = sc.nextDouble();

        System.out.println("volume da piramide: " + volPiramide(baseP, alturaP));

    }

    public static double volPiramide(double base, double altura) {
        return base * altura / 3;
    }
}

