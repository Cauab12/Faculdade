package listaMetodos;

import java.util.Scanner;

public class SuperficieParalelepipedo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique largura, altura e profundidade do paralelepipedo: ");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        double prof = sc.nextDouble();

        double superficiePara = supParalelepipedo(largura, altura, prof);
        System.out.println("Area da superfície: " + superficiePara + " unidades²");
    }

    public static double supParalelepipedo(double largura, double altura, double profundidade) {
        return 2 * (largura * altura + altura * profundidade + largura * profundidade);
    }
}
