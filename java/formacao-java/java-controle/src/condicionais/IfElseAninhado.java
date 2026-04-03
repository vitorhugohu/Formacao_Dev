package condicionais;

import java.util.Scanner;

public class IfElseAninhado {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        double nota = teclado.nextDouble();

        boolean notaInvalida = nota > 10 || nota < 0;

        if(notaInvalida) {
            System.out.println("Nota Inválida!");
        } else {

            if(nota >= 8.1) {
                System.out.println("Conceito A");
                System.out.println("Parabéns!");
            } else {

                if(nota >= 6.1) {
                    System.out.println("Conceito B");
                } else {

                    if(nota >= 4.1) {
                        System.out.println("Conceito C");
                    } else {
                        
                        if(nota >= 2.1) {
                            System.out.println("Conceito D");
                        } else {
                            System.out.println("Conceito E");
                        }

                    }

                }

            }

        }

        teclado.close();
    }
}
