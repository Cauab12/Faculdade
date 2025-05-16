package lista_For;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        int numeroDePalavras = 0;
        boolean emPalavra = false;

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int x = 0; x < frase.length(); x++) {
            char caractere = frase.charAt(x);

            if (frase.charAt(x) == 'a' || frase.charAt(x) == 'A') {
                a++;
            }

            if (frase.charAt(x) == 'e' || frase.charAt(x) == 'E') {
                e++;
            }

            if (frase.charAt(x) == 'i' || frase.charAt(x) == 'I') {
                i++;
            }

            if (frase.charAt(x) == 'o' || frase.charAt(x) == 'O') {
                o++;
            }

            if (frase.charAt(x) == 'u' || frase.charAt(x) == 'U') {
                u++;
            }

            if (caractere == ' ' || caractere == '\t' || caractere == '\n') {
                emPalavra = false;
            } else if (!emPalavra) {
                numeroDePalavras++;
                emPalavra = true;
            }
        }
        System.out.println("Quantidade de vezes que aparece a vogal 'a': " + a);
        System.out.println("Quantidade de vezes que aparece a vogal 'e': " + e);
        System.out.println("Quantidade de vezes que aparece a vogal 'i': " + i);
        System.out.println("Quantidade de vezes que aparece a vogal 'o': " + o);
        System.out.println("Quantidade de vezes que aparece a vogal 'u': " + u);
        System.out.println("Quantidade de palavras: " + numeroDePalavras);
    }
}

