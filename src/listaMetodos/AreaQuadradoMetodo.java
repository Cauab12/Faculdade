package listaMetodos;

import java.util.Scanner;

public class AreaQuadradoMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double l1 = sc.nextDouble();

        double areaQuadrado = areaQuadrado(l1);
        System.out.println("Area: " + areaQuadrado);
    }

    public static double areaQuadrado(double l1) {
        return Math.pow(l1, 2);
    }
}
