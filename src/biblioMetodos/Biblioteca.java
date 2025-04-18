package biblioMetodos;

public class Biblioteca {
    // Cálculo da área do círculo (A = π * r²)
    public static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    // Cálculo da área do retângulo (A = largura * altura)
    public static double areaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    // Cálculo da área do quadrado (A = lado²)
    public static double areaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    // Cálculo da área do triângulo (A = (base * altura) / 2)
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Cálculo do perímetro do círculo (P = 2 * π * r)
    public static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    // Cálculo do perímetro do retângulo (P = 2 * (largura + altura))
    public static double perimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    // Cálculo do perímetro do quadrado (P = 4 * lado)
    public static double perimetroQuadrado(double lado) {
        return 4 * lado;
    }

    // Cálculo do perímetro do triângulo (P = lado1 + lado2 + lado3)
    public static double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    // Cálculo do volume da esfera (V = (4/3) * π * r³)
    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    // Cálculo do volume do cilindro (V = π * r² * altura)
    public static double volumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static double volParalelepipedo(double base, double larg, double altura) {
        return base * larg * altura;
    }

    // Cálculo do volume do cubo (V = lado³)
    public static double volumeCubo(double lado) {
        return Math.pow(lado, 3);
    }

    // Cálculo da média aritmética de dois valores
    public static double mediaAritimetica2Val(double n1, double n2){
        return (n1 + n2)/2;
    }

    // Cálculo da média aritmética de três valores
    public static double mediaAritimetica3Val(double n1, double n2, double n3){
        return (n1 + n2 + n3)/3;
    }

    // Verifica se um número é par ou ímpar
    public static boolean parImpar(int num) {
        return num % 2 == 0;
    }

    // Verifica se o primeiro número é múltiplo do segundo
    public static boolean multiplo(int num1, int num2) {
        return num2 != 0 && num1 % num2 == 0;
    }

    // Retorna o maior valor entre três números
    public static double maiorValor(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    // Retorna o menor valor entre três números
    public static double menorValor(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    // Retorna o valor intermediário entre três números
    public static double valorIntermediario(double a, double b, double c) {
        return a + b + c - maiorValor(a, b, c) - menorValor(a, b, c);
    }

    public static int garantirPositivo(int numero) {
        return Math.abs(numero);
    }


}
