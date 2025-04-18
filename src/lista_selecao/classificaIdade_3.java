package lista_selecao;

/**
 Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
 adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.
 */

import java.util.Scanner;

public class classificaIdade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Idade?");
        int id = sc.nextInt();

        if (id >= 0 && id <= 11) {
            System.out.println("criança até 11 anos");
        } else if (id >= 12 && id <= 17) {
            System.out.println("adolescente de 12 a 17 anos");
        } else if (id >= 18 && id <= 59) {
            System.out.println("adulto de 18 a 59 anos");
        } else {
            System.out.println("idoso com 60 anos ou mais");
        }
        sc.close();
    }
}
