package retanguloExe02;

public class App {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10, 25);
        Retangulo retangulo2 = new Retangulo(5, 15);

        System.out.println("área retangulo1: " + retangulo.areaRetangulo());
        System.out.println("área retangulo2: " + retangulo2.areaRetangulo());

        System.out.println("\nperímetro retangulo1: " + retangulo.perimetroRetangulo());
        System.out.println("perímetro retangulo2: " + retangulo2.perimetroRetangulo());

        System.out.printf("\ncomprimento da diagonal retangulo1: %.2f", retangulo.comprimentoDiagonalRetangulo());
        System.out.printf("comprimento da diagonal retangulo2: %.2f", retangulo2.comprimentoDiagonalRetangulo());
    }
}
