package listMethods;

import java.util.Scanner;

public class volumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("de o raio da esfera p/ calcular seu volume: ");
        double r = sc.nextDouble();

        System.out.println("volume da esfera: " + volEsfera(r));
    }

    public static double volEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 3) / 3;
    }
}

