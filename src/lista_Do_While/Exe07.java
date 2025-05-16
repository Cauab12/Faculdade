package lista_Do_While;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;
        int somaPares = 0;
        int total = 0;
        int somaGeral = 0;

        do {
            System.out.println("Digite um numero (0 p/ sair)");
            numero = sc.nextInt();

            if (numero > 0) {
                somaGeral += numero;
                total++;
            }

            if (numero % 2 == 0) {
                pares++;
                somaPares += numero;
            } else {
                impares++;
            }
        } while (numero != 0);

        if (total > 0) {
            double mediaPares = pares > 0 ? (double) somaPares / pares : 0;
            double mediaGeral = (double) somaGeral / total;

            System.out.println("Quantidade de pares: " + pares);
            System.out.println("Quantidade de ímpares: " + impares);
            System.out.println("Média dos pares: " + mediaPares);
            System.out.println("Média geral: " + mediaGeral);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
    }
}
