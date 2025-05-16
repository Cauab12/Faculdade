package lista_Do_While;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        do {
            System.out.println("Nome do Cliente: ");
            String nome = sc.nextLine();

            System.out.println("Valor das compras: ");
            double valorCompras = sc.nextDouble();
            sc.nextLine();

            double bonus;

            if (valorCompras < 500) {
                bonus = valorCompras * 0.10;
            } else {
                bonus = valorCompras * 0.20;
            }

            System.out.printf("Cliente: %s - Bônus: R$ %.2f%n", nome, bonus);
            System.out.println("-----------------------------------------");

            contador++;
        } while (contador <= 150);
    }
}
