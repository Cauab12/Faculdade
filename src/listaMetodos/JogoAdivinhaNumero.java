package listaMetodos;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        // O metodo nextInt(n) da classe Random serve para gerar um número aleatório entre 0 e n-1.

        System.out.println("Número aleatório gerado: " + numeroSecreto);
    }
}
