package desafios;

import java.util.Scanner;

public class NumeroSecreto {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numero = -1;
        int secreto = (int) (Math.random() * 100); // O Math.random gera um número aleatório entre 0 (inclusive) e 1(exclusive)


        while(numero != secreto) {
            System.out.println("Digite um número entre 0 e 99: ");
            numero = teclado.nextInt();

            if(numero < secreto) {
                System.out.println("O número secreto é maior!");
            } else if (numero > secreto) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto!");
            }
        }
        
        teclado.close();

    }
}
