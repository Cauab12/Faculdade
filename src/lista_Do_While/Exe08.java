package lista_Do_While;

/**
 Escreva um programa que peça ao usuário para digitar uma senha.
 A senha correta é "java123". Enquanto o usuário não digitar a senha correta, o programa deve
 continuar pedindo a senha. Quando a senha estiver correta, exiba a mensagem: "Acesso concedido".
 */
import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;

        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();

            if (!senha.equals("java123")) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                System.out.println("Acesso concedido");
            }
        } while (!senha.equals("java123"));
    }
}
