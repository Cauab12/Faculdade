package listaMetodos;

import java.util.Scanner;

public class VolumeParalelepipedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da base, largura e altura: ");
        double base = sc.nextDouble();
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        double volumeParalelepipedo = volParalelepipedo(base, largura, altura);
        System.out.println("Volume do paralelepipedo: " + volumeParalelepipedo);
    }

    public static double volParalelepipedo(double base, double larg, double altura) {
        return base * larg * altura;
    }
}

