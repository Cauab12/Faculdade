package metodoString;

public class Mensagem {

    public static void main(String[] args) {

        System.out.println(imprimirMensagem());

    }

    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static String imprimirMensagem() {
        return "Olá, mundo!";
    }
}
