package listaMetodos;

import java.util.Scanner;

public class SuperficieCilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro: ");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura do cilindro: ");
        double altura = sc.nextDouble();

        double area = areaSuperficieCilindro(raio, altura);
        System.out.printf("Área da superfície ≈ %.2f unidades²", area);
    }

    public static double areaSuperficieCilindro(double raio, double altura) {
        return 2 * Math.PI * Math.pow(raio, 2) + 2 * Math.PI * raio * altura;
    }
}
