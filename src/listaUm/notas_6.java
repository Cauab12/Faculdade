package listaUm;

import java.lang.Math;
import java.util.Scanner;

public class notas_6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu valor em R$: ");
        int valor = sc.nextInt();

        int n1 = valor / 100;
        valor = valor % 100;

        int n2 = valor / 50;
        valor = valor % 50;

        int n3 = valor / 20;
        valor = valor % 20;

        int n4 = valor / 10;
        valor = valor % 10;

        int n5 = valor / 5;
        valor = valor % 5;

        int n6 = valor / 2;
        valor = valor % 2;

        int n7 = valor / 1;
        valor = valor % 1;

        System.out.println(n1 + " nota(s) de 100");
        System.out.println(n2 + " nota(s) de 50");
        System.out.println(n3 + " nota(s) de 20");
        System.out.println(n4 + " nota(s) de 10");
        System.out.println(n5 + " nota(s) de 5");
        System.out.println(n6 + " nota(s) de 2");
        System.out.println(n7 + " moeda(s) de 1");

        sc.close();
    }
}
