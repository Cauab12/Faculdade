package string;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra;
        int numeroDeVogais = 0;

        do {
            System.out.println("Digite palavras ou (SAIR): ");
            palavra = sc.nextLine();

            for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o') {
                    numeroDeVogais++;
                }
            }
        } while (!palavra.equals("SAIR"));

        System.out.println();
    }
}
