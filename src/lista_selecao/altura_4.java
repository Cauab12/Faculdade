package lista_selecao;

/**
 * Faça um programa que lê a altura de uma pessoa em metros e o seu sexo (use 1
 * para feminino e 2 para masculino). A seguir, o programa deve escrever o peso ideal
 * dessa pessoa conforme descrito: Para homens, use 72.7 x altura -58. Para
 * mulheres, use 62.1 x altura -44.7
 */

import java.util.Scanner;

public class altura_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("altura?");
        double altura = sc.nextDouble();

        System.out.println("sexo? (use 1 " + " para feminino e 2 para masculino)");
        double sexo = sc.nextDouble();

        double pesoM = 72.7 * altura - 58;
        double pesoF = 62.1 * altura - 44.7;

        if (sexo == 2) {
            System.out.printf("peso ideal = %.3f kg\n", pesoM);
        } else {
            System.out.printf("peso ideal = %.3f kg\n", pesoF);
        }
    }
}
