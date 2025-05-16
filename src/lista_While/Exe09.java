package lista_While;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (contador < 6) {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("Maior valor informado: " + maior);
        System.out.println("Menor valor informado: " + menor);

    }
}
