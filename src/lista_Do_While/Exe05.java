package lista_Do_While;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        do {
            System.out.println("---MENU---");
            System.out.println("1- sacar");
            System.out.println("2- depositar");
            System.out.println("3- saldo");
            valor = sc.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("SAQUE!");
                    break;
                case 2:
                    System.out.println("DEPOSITAR!");
                    break;
                case 3:
                    System.out.println("SALDO!");
                    break;
                    default:
            }

        } while (valor == 1 || valor == 2 || valor == 3);
    }
}
