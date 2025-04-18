package listaUmCompl;

import java.lang.Math;
import java.util.Scanner;

public class horario_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário atual!");
        System.out.println("Coloque a hora: ");
        int hr = sc.nextInt();

        System.out.println("Minutos: ");
        int min = sc.nextInt();

        System.out.println("Segundos: ");
        int s = sc.nextInt();

        int seg = (hr * 3600) + (min * 60) + s;
        System.out.println("O dia tem um total de " + seg + " segundos!");

        int segf = (86400 - seg);
        System.out.println("Faltam " + segf + " segundos para acabar o dia!");

        sc.close();
    }
}


