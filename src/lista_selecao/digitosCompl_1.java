/**
Implemente um programa que leia um valor inteiro e indique quantos
digitos esse valor possui.
 */

package lista_selecao;

import java.util.Scanner;

public class digitosCompl_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        int numDigitos = 0;

        if (valor == 0) {
            numDigitos = 1;
            System.out.println("possui " + numDigitos + " digito(s)");
        } else {
            if (valor < 0) {
                valor = -valor;
            }
            while (valor > 0) {
                valor = valor / 10;
                numDigitos++;
            }
            System.out.println("Este valor inteiro possui: " + numDigitos + " digitos");
        }
    }
}
