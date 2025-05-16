package string;

import java.util.Scanner;

public class MetodosDeStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cidade1, cidade2, juncao;

        int tamanho, compara;
        System.out.print("Digite o nome da cidade: ");
        cidade1 = in.nextLine();
        tamanho = cidade1.length();

        System.out.println("Esta cidade tem "+ tamanho + " letras no seu nome");
        if (tamanho == 0)
            System.out.println("cidade sem nome");

        // verifica se a string é vazia, retornado true para vazia e false para não vazia
        if (!cidade1.isEmpty())
            System.out.println("cidade com nome");

        System.out.print("Digite o nome da cidade: ");
        cidade2 = in.nextLine();

        // metodo que compara duas strings. Se forem iguais o metodo retorna 0
        compara = cidade1.compareToIgnoreCase(cidade2);
        if (compara == 0)
            System.out.println("As cidades são iguais");
        else
            System.out.println("As cidades são diferentes");

        // metodo que concatena duas string
        juncao = cidade1 + " " + cidade2;
        System.out.println(juncao);
        juncao =cidade1.concat(" " + cidade2);
        System.out.println(juncao);

        // metodo endswith que compara se a string termina com uma determinada cadeia de caracteres. retorno true se verdadeiro
        if (cidade1.endsWith("as"))
            System.out.println("Cidade termina com a letra as");

        // converte um string para letras minusculas
        cidade1 = cidade1.toLowerCase();
        System.out.println(cidade1);

        // converte um string para letras maiusculas
        cidade1 = cidade1.toUpperCase();
        System.out.println(cidade1);



    }
}

