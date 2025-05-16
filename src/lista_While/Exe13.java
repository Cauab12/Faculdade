package lista_While;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        String continuar = "s";

        while (continuar.equals("s")) {
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.next();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            System.out.print("Valor unitário: R$ ");
            double valorUnitario = sc.nextDouble();

            double subtotal = quantidade * valorUnitario;
            total += subtotal;

            System.out.println("Subtotal do produto \"" + nomeProduto + "\": R$ " + subtotal);
            System.out.print("Deseja adicionar outro produto? (s para sim, n para não): ");
            continuar = sc.next();
        }

        System.out.println("\nValor total a pagar: R$ " + total);
    }
}
