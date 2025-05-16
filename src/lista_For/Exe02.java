package lista_For;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro X: (1 <= X <= 1000)");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}

