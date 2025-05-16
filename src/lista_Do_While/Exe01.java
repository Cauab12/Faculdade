package lista_Do_While;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double tempCelsiu = sc.nextDouble();

            double tempFahrenheit = (9 * tempCelsiu) / 5 + 32;
            System.out.println("Equivalente em Fahrenheit: " + tempFahrenheit);

            System.out.println("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);

        } while (resp != 'n');
    }
}
