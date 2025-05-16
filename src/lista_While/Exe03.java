package lista_While;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coordenada X: ");
        double x = sc.nextInt();

        System.out.println("Coordenada Y: ");
        double y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
