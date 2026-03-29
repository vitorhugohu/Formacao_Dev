package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro salário: ");
        String valor1 = teclado.nextLine().replace(",", ".");
        double salario1 = Double.parseDouble(valor1);

        System.out.print("Informe o segundo salário: ");
        String valor2 = teclado.nextLine().replace(",", ".");
        double salario2 = Double.parseDouble(valor2);

        System.out.print("Informe o terceiro salário: ");
        String valor3 = teclado.nextLine().replace(",", ".");
        double salario3 = Double.parseDouble(valor3);

        double total = salario1 + salario2 + salario3;
        double media = total / 3;

        System.out.printf("A média salarial é de %.2f", media);

        teclado.close();
    }

}
