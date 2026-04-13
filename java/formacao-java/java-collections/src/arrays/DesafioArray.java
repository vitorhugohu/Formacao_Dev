package arrays;

import java.util.Scanner;

public class DesafioArray {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        IO.print("quantos alunos tem na turma?");
       
        int qtdAlunos = teclado.nextInt();
        double[] notas = new double[qtdAlunos];
        double somaNotas = 0;

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Qual é a nota do %d? ", i + 1);
            notas[i] = teclado.nextDouble();
            teclado.nextLine();
        }

        for(double nota: notas) {
            somaNotas += nota;
        }

        double mediaTurma = somaNotas / qtdAlunos;
        System.out.printf("A média da turma é %.2f", mediaTurma);
        
        teclado.close();
    }
}
