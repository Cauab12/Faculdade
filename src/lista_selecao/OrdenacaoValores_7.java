package lista_selecao;

import java.util.Scanner;

public class OrdenacaoValores_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (n1): ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor (n2): ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro valor (n3): ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite a opção (1, 2 ou 3): ");
        int opcao = scanner.nextInt();

        double aux;

        if (opcao == 1) {
            // Ordenar em ordem crescente
            if (n1 > n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 > n3) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n1 > n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            System.out.println("Valores em ordem crescente: " + n1 + ", " + n2 + ", " + n3);
        } else if (opcao == 2) {
            // Ordenar em ordem decrescente
            if (n1 < n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 < n3) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n1 < n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            System.out.println("Valores em ordem decrescente: " + n1 + ", " + n2 + ", " + n3);
        } else if (opcao == 3) {
            // Colocar o maior valor entre os demais
            if (n1 < n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 < n3) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            System.out.println("Maior valor entre os outros: " + n1 + ", " + n2 + ", " + n3);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}