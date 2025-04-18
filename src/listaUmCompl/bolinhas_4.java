package listaUmCompl;

/**
Uma empresa de bolinhas de gude precisa de um programa que calcula a quantidade
de caixas necessárias para embalar as bolinhas. A empresa trabalha com caixas cuja
capacidade é de 100 bolinhas. Faça um programa que leia a quantidade de bolinhas, calcule
e escreva a quantidade de caixas necessárias para embalar as bolinhas.
 */

import java.util.Scanner;

public class bolinhas_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double caixa = 100;
        double bol;

        System.out.println("qual a quantidade de bolinhas?");
        bol = sc.nextInt();

        double qntCaixas = Math.ceil(bol / caixa);

        System.out.println("precisaria de " + qntCaixas + " caixa(s)");
    }
}