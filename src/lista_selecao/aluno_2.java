package lista_selecao;

/*
Faça um programa que informe se o aluno está aprovado ou está em G2 ou foi
reprovado.
 */

import java.util.Scanner;

public class aluno_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota p1: ");
        double n1 = sc.nextDouble();

        System.out.println("Nota p2: ");
        double n2 = sc.nextDouble();

        System.out.println("Nota p3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media < 7) {
            System.out.println("reprovado");
        } else {
            System.out.println("aprovado");
        }
    }
}
