package lista_For;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        int soma = 0;
        int fatorial = 1;

        while (valor < 0) {
            System.out.println("Valor não pode ser negativo.");
            System.out.println("Digite um valor inteiro: ");
            valor = sc.nextInt();
        }

        for (int i = 1; i <= valor; i++) {

            soma += i;
            fatorial *= i;

        }

        System.out.println(soma);
        System.out.println(fatorial);
    }
}
