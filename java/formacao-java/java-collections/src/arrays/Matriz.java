package arrays;

import java.util.Scanner;

public class Matriz {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        IO.print("Informe a quantidade de alunos: ");
        int qtdeAlunos = teclado.nextInt();
        teclado.nextLine();

        IO.print("Informe a quantidade de notas: ");
        int qtdeDeNotas = teclado.nextInt();
        teclado.nextLine();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeDeNotas];
        double[] medias = new double[qtdeAlunos];

        
        for(int a = 0; a < qtdeAlunos; a++) {
            double total = 0;
            for(int n = 0; n < qtdeDeNotas; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = teclado.nextDouble();
                teclado.nextLine();

                total += notasDaTurma[a][n];
            }

            medias[a] = total / qtdeDeNotas;
        }

        for(int a = 0; a < qtdeAlunos; a++) {
            System.out.printf("A média do aluno %d é %.2f!\n", a + 1, medias[a]);
        }

        teclado.close();
    }
}
