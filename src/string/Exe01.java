package string;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        int numeroDePalavras = 0;
        boolean dentroDePalavra = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isWhitespace(c)) {
                dentroDePalavra = false;

            } else if (!dentroDePalavra) {
                numeroDePalavras++;
                dentroDePalavra = true;
            }
        }

        System.out.println("Número de palavras: " + numeroDePalavras);
    }
}


