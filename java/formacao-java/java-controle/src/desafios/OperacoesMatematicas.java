package desafios;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 3;

        while(opcao == 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();
                double resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 2) {
                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();
                double resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}