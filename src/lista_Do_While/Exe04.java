package lista_Do_While;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInteiro;
        int soma = 0;
        int fatorial = 1;

        do {
            System.out.println("Digite um valor inteiro: (POSITIVO)");
            numInteiro = sc.nextInt();

            for (int i = 1; i <= numInteiro; i++) {
                fatorial *= i;
            }

            soma += numInteiro;

        } while (numInteiro < 0);

        System.out.println("Soma: " + soma);
        System.out.println("Fatorial: " + fatorial);
    }
}
