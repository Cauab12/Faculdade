package lista_While;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1000;

        while (i <= 2000) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

