package lista_While;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int contador = 1;

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        while (i <= 6) {
            System.out.println("Digite a altura do " + (contador++) + " aluno: ");
            double altura = sc.nextDouble();

            if (altura > maior) {
                maior = altura;
            }

            if (altura < menor) {
                menor = altura;
            }

            i++;
        }

        System.out.printf("Maior altura: %.2f", maior);
        System.out.printf("\nMenor altura: %.2f", menor);
    }
}
