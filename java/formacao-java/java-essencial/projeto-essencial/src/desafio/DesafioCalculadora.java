package desafio;

import java.util.Scanner;

public class DesafioCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro número: ");
        String num1 = teclado.nextLine().replace(',', '.');
        double n1 = Double.parseDouble(num1);

        System.out.print("Digite o valor do segundo número: ");
        String num2 = teclado.nextLine().replace(',', '.');
        double n2 = Double.parseDouble(num2);

        System.out.print("Digite qual operação você deseja fazer: (+, -, *, /, %) ");
        String operacao = teclado.nextLine();
        
        double resultado = "+".equals(operacao) ? n1 + n2 : 0;
        resultado = "-".equals(operacao) ? n1 - n2 : resultado;
        resultado = "*".equals(operacao) ? n1 * n2 : resultado;
        resultado = "/".equals(operacao) ? n1 / n2 : resultado;
        resultado = "%".equals(operacao) ? n1 % n2 : resultado;
        
        
        System.out.printf("Resultado é %.2f ", resultado);
        // %n -> quebra de linha, %s -> string
    }
}
