/**
Escreva um programa que determina o preço de venda dos produtos de uma loja
conforme o preço de custo desses produtos. O programa deve ler o preço de custo
e calcular o valor de venda conforme o que segue: valor abaixo de R$10,00, lucro
de 70%; de R$10,00 a menos de R$30,00, lucro de 50%; de R$30,00 a menos de
R$50,00 lucro de 40%; de R$50,00 ou mais, lucro de 30%.
 */

package lista_selecao;

import java.util.Scanner;

public class preco_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("preço de custo; ");
        double precoCusto = sc.nextDouble();

        double valorVenda;

        if (precoCusto < 10) {
            valorVenda = precoCusto + (precoCusto * 0.70);
            System.out.println("valor de venda = " + valorVenda);
        } else if (precoCusto >= 10 && precoCusto < 30) {
            valorVenda = precoCusto + (precoCusto * 0.50);
            System.out.println("valor de venda = " + valorVenda);
        } else if (precoCusto >= 30 && precoCusto < 50) {
            valorVenda = precoCusto + (precoCusto * 0.40);
            System.out.println("valor de venda = " + valorVenda);
        } else {
            valorVenda = precoCusto + (precoCusto * 0.30);
            System.out.println("valor de venda = " + valorVenda);
        }
    }
}
