package string;

import java.util.Scanner;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        String novaFrase = trocarVogaisPorMaiusculas(frase);

        System.out.println("Frase com vogais em maiúsculas: " + novaFrase);
    }

    public static String trocarVogaisPorMaiusculas(String frase) {
        StringBuilder novaFrase = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (ehVogal(caractere)) {

                /*Se o caractere atual for uma vogal, ele é transformado
                em maiúscula usando Character.toUpperCase(caractere)
                e adicionado ao StringBuilder novaFrase.*/

                novaFrase.append(Character.toUpperCase(caractere));
            } else {
                novaFrase.append(caractere);
            }
        }

        return novaFrase.toString();
    }

    public static boolean ehVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}