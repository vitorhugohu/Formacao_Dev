package desafios;

import java.util.Scanner;

public class NumeroSecretoCompV1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor secreto (0 - 999): ");
        int secreto = teclado.nextInt();

        int chute = -1;
        int qtdeTentativas = 0;

        while(secreto != chute && qtdeTentativas < 1_000_000) {
            chute = (int) (Math.random() * 1000);
            qtdeTentativas++;
        }

        if(secreto == chute) {
            System.out.printf("O número secreto é %d e demorou %d tentativas!", chute, qtdeTentativas);
        } else {
            System.out.printf("Tentei %d vezes e não encontrei o número", qtdeTentativas);
        }

        teclado.close();
    }
}
