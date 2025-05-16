package lista_While;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produto = 1;
        int soma = 0;
        int contador = 0;

        while (contador < 4) {
            System.out.println("Digite o " + (contador + 1) + " valor: ");
            int valor = scanner.nextInt();

            soma = soma + valor;
            produto = produto * valor;

            contador++;
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("O produto dos valores, é: " + produto);
    }
}

