package lista_For;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
