package lista_While;

public class Exe08 {
    public static void main(String[] args) {

        int i = 1000;

        while (i <= 1999) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
            i++;
        }
    }
}
