package lista_Do_While;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 500;
        int soma = 0;

        do {
            if (i % 2 != 0) {
                soma += i;
                System.out.println(i);
            }
            i++;
        } while (i <= 700);

        System.out.println("Soma dos ímpares entre 500 e 700: " + soma);
    }
}

