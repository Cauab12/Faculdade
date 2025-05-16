package alunoExe04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno a1 = new Aluno("Robertin", "2025");

        System.out.print("Digite a nota P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota P2: ");
        double p2 = scanner.nextDouble();

        System.out.print("Digite a nota P3: ");
        double p3 = scanner.nextDouble();

        System.out.print("Digite a média de exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        System.out.print("Digite a frequência (%): ");
        double frequencia = scanner.nextDouble();

        a1.atualizarNotas(p1, p2, p3, mediaExercicios);
        a1.atualizarFrequencia(frequencia);

        System.out.println("Nota G1: " + a1.getG1());

        if (!a1.aprovadoPorMedia()) {
            System.out.println("Aluno não aprovado por média. Será necessário fazer G2.");

            System.out.print("Digite a nota da prova G2: ");
            double g2 = scanner.nextDouble();
            a1.definirG2(g2);

            System.out.println("Média final: " + a1.getMediaFinal());
            System.out.println("Situação: " + a1.verificarAprovacaoFinal());
        } else {
            System.out.println("Aluno aprovado por média!");
        }
    }
}

