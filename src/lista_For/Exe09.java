package lista_For;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("A frase possui " + contador + " letras 'a'.");
    }
}
