package listaMetodos;

import java.util.Scanner;

public class AreaRetanguloMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o base do triangulo: ");
        double base = sc.nextDouble();

        System.out.println("Digite o altura do triangulo: ");
        double altura = sc.nextDouble();

        double areaRetangulo = areaRetangulo(base, altura);
        System.out.println("Area do retangulo: " + areaRetangulo);
    }

    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }
}
