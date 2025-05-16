package lista_While;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        int i = 1;
        int soma = 0;

        while (i <= numero) {

            if (numero % i == 0) {
                System.out.println("Divisor: " + i);
                soma++;
            }
            i++;
        }

        System.out.println("\nQnt de divisores: " + soma);
    }
}
