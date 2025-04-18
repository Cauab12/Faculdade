package listaUm;

import java.lang.Math;
import java.util.Scanner;

public class medias_1 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Media de Notas!");
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double c = scanner.nextDouble();

        double mediaAritmetica = (a + b + c) / 3;

        double mediaHarmonica;
        if (a != 0 && b != 0 && c != 0) {
            mediaHarmonica = 3 / ((1 / a) + (1 / b) + (1 / c));
        } else {
            mediaHarmonica = 0;
        }

        System.out.printf("Média Aritmética: %.2f\n", mediaAritmetica);

        System.out.printf("Média Harmônica: %.2f\n", mediaHarmonica);

        scanner.close();
    }
}

