package listaUm;

import java.lang.Math;
import java.util.Scanner;

public class temp_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fahrenheit?");
        int f = scanner.nextInt();

        int c = (f-32) * 5/9;

        System.out.print(f + "f sao " + c + " graus Celsius.");

        scanner.close();
    }
}