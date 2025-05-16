package retanguloExe02;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaRetangulo() {
        return base * altura;
    }

    public double perimetroRetangulo() {
        return 2 * (base + altura);
    }

    public double comprimentoDiagonalRetangulo() {
        return Math.sqrt((base * base) + (altura * altura));
    }
}

