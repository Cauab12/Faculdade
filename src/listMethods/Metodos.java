package listMethods;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Informe o valor da base: ");
        num1 = sc.nextDouble();

        System.out.println("Informe o valor da altura: ");
        num2 = sc.nextDouble();

        System.out.println("Informe o valor do raio, p/ calcular a area do círculo: ");
        double r = sc.nextDouble();

        System.out.println("Informe o valor de um lado, p/ area do quadrado: ");
        double l1 = sc.nextDouble();

        System.out.println("Informe o valor da base, largura e altura: ");
        double base = sc.nextDouble();
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        double areaTri = areaTriangulo(num1, num2);
        System.out.println("A área do triângulo é: " + areaTri);

        double areaRet = areaRetangulo(num1, num2);
        System.out.println("A área do retangulo é: " + areaRet);

        double areaCirc = areaCirculo(r);
        System.out.println("A área do círculo é: " + areaCirc);

        double areaQuad = areaQuadrado(l1);
        System.out.println("A área do quadrado é: " + areaQuad);

        double volPara = volParalelepipedo(base, largura, altura);
        System.out.println("volume do paralelepipedo: " + volPara);
    }

    public static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2); //Math.pow (base, expoente)
    }

    public static double areaQuadrado(double l1) {
        return Math.pow(l1, 2);
    }

    public static double volParalelepipedo(double base, double larg, double altura) {
            return base * larg * altura;
    }
}
