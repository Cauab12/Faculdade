package lista_For;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de alunos: ");
        int numAlunos = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("nota do aluno " + i + ": ");
            double nota = sc.nextDouble();

            soma += nota;
        }
        double media = soma / numAlunos;
        System.out.println("media da turma: " + media);
    }
}
