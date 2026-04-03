package condicionais;

import java.util.Scanner;

public class If {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a média final do aluno: ");
        double media = Double.parseDouble(teclado.nextLine().replace(',', '.'));

        if (media <= 10 && media >= 7) {
            System.out.println("Aluno aprovado!");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("Aluno em recuperação!");
        }

        boolean criterioReprovacao = media < 4.5 && media >= 0;

        if (criterioReprovacao) {
            System.out.println("Aluno reprovado!");
        }

        System.out.print("A média final é: " + media);

        teclado.close();
    }
}