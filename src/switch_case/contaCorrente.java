package switch_case;

import java.util.Scanner;

public class contaCorrente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo médio da conta corrente
        System.out.print("Digite o saldo médio da conta corrente: R$ ");
        double saldo = scanner.nextDouble();

        // Calcula o limite de crédito uma vez, com base no saldo
        double limite = 0;
        if (saldo >= 500 && saldo < 1000) {
            limite = saldo * 0.08; // 8% do saldo
        } else if (saldo >= 1000) {
            limite = saldo * 0.15; // 15% do saldo
        }

        // Exibe o menu de opções
        System.out.println("\nMenu de Opções:");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Exibir limite");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1: // Opção 1: Sacar
                System.out.print("Digite o valor a ser sacado: R$ ");
                double valorSaque = scanner.nextDouble();

                // Verifica se o saque é possível (saldo + limite)
                if (valorSaque <= saldo + limite) {
                    saldo -= valorSaque;
                    System.out.printf("Saque realizado com sucesso! Saldo atual: R$ %.2f\n", saldo);
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
                break;

            case 2: // Opção 2: Depositar
                System.out.print("Digite o valor a ser depositado: R$ ");
                double valorDeposito = scanner.nextDouble();

                // Verifica se o valor do depósito é válido (positivo)
                if (valorDeposito > 0) {
                    saldo += valorDeposito;
                    System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f\n", saldo);
                } else {
                    System.out.println("Valor de depósito inválido.");
                }
                break;

            case 3: // Opção 3: Exibir limite
                System.out.printf("O seu limite é: R$ %.2f\n", limite);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}