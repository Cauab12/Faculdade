package lista_For;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares= 0;
        int somaImpares = 0;
        int total = 0;
        int somaPares = 0;

        for(;;) {
            System.out.println("Digite números positivos: (0 para sair) ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            total++;

            if (numero % 2 == 0) {
                somaPares += numero;
                pares++;
            } else {
                somaImpares += numero;
            }
        }

        double somaGeral = somaPares + somaImpares;
        int mediaPares = (pares > 0) ? somaPares / pares : 0; // condicao ternária
        double mediaGeral = (total > 0) ? somaGeral / total : 0;

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
        System.out.println("Média dos valores pares: " + mediaPares);
        System.out.println("Média geral dos números lidos: " + mediaGeral);
    }
}
