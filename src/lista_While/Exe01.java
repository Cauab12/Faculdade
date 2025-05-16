package lista_While;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os números inteiros: ");
        int n = sc.nextInt();

        int soma = 0;

        while (n != 0) {
            soma = soma + n;
            n = sc.nextInt();
        }

        System.out.println(soma);
    }
}
