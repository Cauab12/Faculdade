package listaUm;

import java.lang.Math;
import java.util.Scanner;

public class valores_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva dois valores: ");

        int n1;
        n1 = scanner.nextInt();
        int n2;
        n2 = scanner.nextInt();

        int soma = n1 + n2;
        int maiorn = Math.max(n1, n2);
        int dif = n1 - n2;
        int media = (n1 + n2) / 2;
        int dist = Math.abs(n1 - n2);
        int menorn = Math.min(n1, n2);

        System.out.println("soma: " + soma);
        System.out.println("maior numero: " + maiorn);
        System.out.println("diferenca: " + dif);
        System.out.println("media: " + media);
        System.out.println("distancia: " + dist);
        System.out.println("menor: " + menorn);
    }
}

