package listaMetodos;

import java.util.Scanner;

public class AreaTrianguloMetodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Informe o valor da base: ");
        num1 = sc.nextDouble();

        System.out.println("Informe o valor da altura: ");
        num2 = sc.nextDouble();

        double areaTri = areaTriangulo(num1, num2);
        System.out.println("Area do Triangulo: " + areaTri);
    }

    public static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }
}
