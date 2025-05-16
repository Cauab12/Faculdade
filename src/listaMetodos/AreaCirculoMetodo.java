package listaMetodos;

import java.util.Scanner;

public class AreaCirculoMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double areaCirculo = areaCirculo(raio);
        System.out.println("Area Circulo: " + areaCirculo);
    }

    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2); //Math.pow (base, expoente)
    }
}
