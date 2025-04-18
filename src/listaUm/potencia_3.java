package listaUm;

import java.lang.Math;
import java.util.Scanner;

public class potencia_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        double n = scanner.nextDouble();

        double n1 = Math.pow(n, 2);
        double n2 = Math.pow(n, 3);
        double n3 = Math.pow(n, 4);

        System.out.printf("Valor de n ao quadrado = %.0f\n", n1);
        System.out.printf("Valor de n ao cubo = %.0f\n", n2);
        System.out.printf("Valor de n a quarta potencia = %.0f\n", n3);
    }
}
