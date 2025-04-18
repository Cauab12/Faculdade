package listaUmCompl;

/**
 Faça um programa que leia a capacidade (em litros) do tanque de um carro, o seu
 consumo médio (km/litro) e a distância (em km) que esse carro precisa percorrer. O
 programa deve calcular e escrever tantas vezes será necessário parar para abastecer para
 que o carro consiga percorrer a distância informada.
 */

import java.lang.Math;
import java.util.Scanner;
public class carro_3
{
    public static void main(String args[]){
        //criacao do objeto Scanner
        Scanner teclado = new Scanner (System.in);

        //criaca de variaveis
        double capacidade;
        double consumo;
        double distancia;
        double paradas;

        //Entrada de dados
        System.out.println("Digite a capacidade em litros");
        capacidade = teclado.nextDouble();
        System.out.println("Digite o consumo médio em Km/litros");
        consumo = teclado.nextDouble();
        System.out.println("Digite a distância em Km");
        distancia = teclado.nextDouble();

        //operacoes
        paradas = Math.ceil (distancia / (consumo*capacidade));

        //saida de dados
        System.out.printf("Precisamos de " +paradas+ " paradas para a viagem");
    }
}
