package listaUm;

import java.lang.Math;
import java.util.Scanner;

public class orbita_2 {
    public static void main(String[] args) {
        // Constantes
        final double G = 6.67426e-11; // Constante gravitacional (m³/kg/s²)
        final double M = 5.97e24; // Massa da Terra (kg)
        final double R = 6371e3; // Raio da Terra (m)
        final double PI = Math.PI; // Valor de PI

        // Tempos de órbita em segundos
        double T1 = 2700;   // 45 minutos
        double T2 = 5400;   // 90 minutos
        double T3 = 86400;  // 1 dia

        // Cálculo das altitudes
        double h1 = (G * M * Math.pow(T1, 2) / (4 * Math.pow(PI, 2))) - R;
        double h2 = (G * M * Math.pow(T2, 2) / (4 * Math.pow(PI, 2))) - R;
        double h3 = (G * M * Math.pow(T3, 2) / (4 * Math.pow(PI, 2))) - R;
        //Math.pow(base, expoente);

        System.out.printf("Para T = %.0f segundos, a altitude h = %.2f km\n", T1, h1 / 1000);
        System.out.printf("Para T = %.0f segundos, a altitude h = %.2f km\n", T2, h2 / 1000);
        System.out.printf("Para T = %.0f segundos, a altitude h = %.2f km\n", T3, h3 / 1000);
    }
}


/*
Um satélite será lançado para uma órbita circular em torno da Terra, de forma que complete uma
órbita completa em torno do planeta a cada T segundos.

A altitude h que o satélite deverá estar pode ser calculada da seguinte forma:

h = (G x M x T2 / 4 x pi2) - R

G = 6.67426 × 10−11𝑚3𝐾𝑔−1𝑠−2 -constante gravitacional de Newton
𝑀 = 5.97 × 1024𝐾𝑔    -massa da Terra
R = 6371 𝐾𝑚 - raio da Terra (não esqueça de usar o valor em metros na fórmula)

Escreva um programa que calcule h a partir de T. Teste com 45 minutos, 90 minutos e um dia inteiro
(nesse caso, chamamos de órbita geoestacionária). O que você conclui?

DICA: para usar o valor de PI,
importe a biblioteca matemática: “import math” O valor de PI é obtido
assim: “math.PI”
*/
