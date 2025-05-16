import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dataPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário uma data no formato dd/MM/yyyy
        System.out.print("Digite uma data (dd/mm/yyyy): ");
        String dataTexto = scanner.nextLine();

        // Formata a string para o tipo LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataTexto, formatter);

        // Obtém o dia da semana
        DayOfWeek diaSemana = data.getDayOfWeek();

        // Mostra o dia da semana
        System.out.println("Dia da semana: " + diaSemana);

    }
}
