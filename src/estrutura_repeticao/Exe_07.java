package estrutura_repeticao;

import java.util.Scanner;

/**
 Faça um programa que leia uma frase e descubra: quantas vezes
 aparecem as vogais a, e, i, o, , separadamente; quantas palavras
 contém esta frase. Mostre este resultado na tela.
 */

    public class Exe_07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lê a frase
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine().toLowerCase();

            // Contadores de vogais
            int a = 0, e = 0, i = 0, o = 0, u = 0;

            // Contagem das vogais usando if/else
            for (int j = 0; j < frase.length(); j++) {
                char c = frase.charAt(j);
                if (c == 'a') {
                    a++;
                } else if (c == 'e') {
                    e++;
                } else if (c == 'i') {
                    i++;
                } else if (c == 'o') {
                    o++;
                } else if (c == 'u') {
                    u++;
                }
            }

            // Contagem de palavras
            String[] palavras = frase.trim().split("\\s+");
            int quantidadePalavras = palavras.length;

            // Exibe os resultados
            System.out.println("\nContagem de vogais:");
            System.out.println("A: " + a);
            System.out.println("E: " + e);
            System.out.println("I: " + i);
            System.out.println("O: " + o);
            System.out.println("U: " + u);

            System.out.println("\nNúmero de palavras na frase: " + quantidadePalavras);
        }
    }
