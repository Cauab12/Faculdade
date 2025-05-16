package listaMetodos;

import java.util.Scanner;

public class SuperficieEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio p/ calcular superfície da esfera: ");
        double raio = sc.nextDouble();

        double supEsfera = supEsfera(raio);
        System.out.printf("Área da superfície ≈ %.2f unidades²", supEsfera);
    }

    public static double supEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
