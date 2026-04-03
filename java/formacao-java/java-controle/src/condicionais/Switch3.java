package condicionais;

import java.util.Scanner;

public class Switch3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String diaDaSemana = teclado.nextLine();

        switch (diaDaSemana) {
            case "segunda" -> System.out.println("Hoje é segunda-feira.");
            case "terca" -> System.out.println("Hoje é terça-feira.");
            case "quarta" -> System.out.println("Hoje é quarta-feira.");
            case "quinta" -> System.out.println("Hoje é quinta-feira.");
            case "sexta" -> System.out.println("Hoje é sexta-feira.");
            case "sábado" -> System.out.println("Hoje é sábado.");
            case "domingo" -> System.out.println("Hoje é domingo.");
            default -> System.out.println("Dia da semana inválido.");
        }

        System.out.println("Fim do programa.");

        teclado.close();
    }
}
