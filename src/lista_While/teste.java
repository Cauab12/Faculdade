package lista_While;

/**
 * Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
 * metro e cresce 3 centímetros por ano. Construa um programa que calcule e exiba
 * quantos anos serão necessários para que Zé seja maior que Chico.
 */

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double chico = 1.50;
        double ze = 1.10;
        double anos = 0;

        while (ze <= chico) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        }
        System.out.println(anos);
    }
}
