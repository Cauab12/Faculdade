package triangleExe03;

public class Main {
    public static void main(String[] args) {

        Triangle triangulo = new Triangle(13, 15, 15);
        Triangle triangulo2 = new Triangle(16, 16, 16);

        System.out.println("Tipo triangulo1: " + triangulo.tipoTriangulo());
        System.out.println("Tipo triangulo2: " + triangulo2.tipoTriangulo());
    }
}
