package lista_selecao;

/*
Escreva um programa que lê a idade e informa se é menor ou maior de idade
 */

import java.util.Scanner;

public class idade_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("vc é maior de idade");
        } else {
            System.out.println("menor");
        }
    }
}
