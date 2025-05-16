package lista_Do_While;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 100;
        int contador = 0;

        do {
            i++;
            if (i % 7 == 0) {
                System.out.println(i);
                contador++;
            }
        } while (contador < 50);
    }
}
