package lista_For;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        for (int i = (n - 1); i >= 0; i--) {
            System.out.println(i);
        }
    }
}
