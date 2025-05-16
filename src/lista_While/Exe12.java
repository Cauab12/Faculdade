package lista_While;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fatorial = 1;
        int i = 1;

        while (i <= num) {
            fatorial = fatorial * i;
            i++;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
