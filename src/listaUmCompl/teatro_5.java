package listaUmCompl;

/**
Uma casa de espetáculos teatrais precisa de um programa que calcula   o valor do
ingresso. Faça um programa que leia o custo total do espetáculo (esse valor total é a soma
dos gastos com: elenco, técnicos, local da apresentação, ...) e o número de poltronas
existentes no teatro. O programa deve solicitar ainda ao usuário: percentual de lucro
desejado, percentual mínimo de ocupação esperado (das poltronas do teatro) em cada
espetáculo e quantidade de espetáculos que será realizada. Com base nesses dados, o
programa deve calcular e escrever o valor do ingresso.
 */

import java.util.Scanner;

public class teatro_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo total do espetáculo: R$ ");
        double custoTotal = scanner.nextDouble();

        System.out.print("Digite o número de poltronas no teatro: ");
        int numPoltronas = scanner.nextInt();

        System.out.print("Digite o percentual de lucro desejado (%): ");
        double percentualLucro = scanner.nextDouble();

        System.out.print("Digite o percentual mínimo de ocupação (%): ");
        double percentualOcupacao = scanner.nextDouble();

        System.out.print("Digite a quantidade de espetáculos: ");
        int quantidadeEspetaculos = scanner.nextInt();

        double poltronasOcupadas = (percentualOcupacao / 100) * numPoltronas;

        double lucroTotal = (percentualLucro / 100) * custoTotal;

        double custoTotalComLucro = custoTotal + lucroTotal;

        double valorIngresso = custoTotalComLucro / (poltronasOcupadas * quantidadeEspetaculos);

        System.out.printf("O valor do ingresso será: R$ %.2f\n", valorIngresso);
        System.out.println(poltronasOcupadas + "%");
        System.out.println(lucroTotal);
        System.out.println(custoTotalComLucro);

    }
}
