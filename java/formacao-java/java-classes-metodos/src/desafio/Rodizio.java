package desafio;

import java.util.Scanner;

public class Rodizio {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Pessoa maria = new Pessoa("Maria", 63);
        Pessoa mario = new Pessoa("Mario", 92);

        System.out.printf("\n\nMaria está com peso de %.2f kg", maria.peso);
        System.out.printf("\nMário está com peso de %.2f kg", mario.peso);

        int opcao = 0;
        
        while(opcao != 2) {
            IO.print("\n\nMenu\n============\n1) Rodada de Comida\n2) Sair\n\nInforme a opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            if(opcao == 1) {
                IO.print("Informe o nome da comida: ");
                String nomeComida = teclado.nextLine();

                IO.print("Informe o peso da comida: ");
                double pesoComida = teclado.nextDouble();
                teclado.nextLine();

                Comida novaComida = new Comida(nomeComida, pesoComida);

                maria.comer(novaComida);
                mario.comer(novaComida);
            }
        }

        System.out.printf("\n\nMaria está com peso de %.2f kg", maria.peso);
        System.out.printf("\nMário está com peso de %.2f kg", mario.peso);

        teclado.close();
    }
}
