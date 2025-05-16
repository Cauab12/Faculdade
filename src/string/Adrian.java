package string;

import java.util.Scanner;
public class Adrian
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Escreva um número inteiro: ");
        num = teclado.nextInt();

        System.out.println("A quantidade de dígitos que esse número possui é: " + quantidadeDeDigitos(num));
    }

    public static int quantidadeDeDigitos(int num) {
        String numString = Integer.toString(num);
        return numString.length();
    }
}