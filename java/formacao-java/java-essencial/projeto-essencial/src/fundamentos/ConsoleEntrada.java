package fundamentos;

import java.util.Scanner;

public class ConsoleEntrada {
    
    static void main() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual é a sua idade? ");
        int idade = teclado.nextInt();
        teclado.nextLine(); // Capturar \n extra

        System.out.print("Qual é o seu nome? ");
        String nome = teclado.nextLine();

        System.out.print("Qual é o seu sobrenome? ");
        String sobrenome = teclado.nextLine();

        System.out.printf("Nome: %s, Idade: %d anos, Sobrenome: %s", nome, idade, sobrenome);

        teclado.close();
    }

}
