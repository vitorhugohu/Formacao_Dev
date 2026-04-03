package operadores;

import java.util.Scanner;

public class Logicos {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Trabalho de terça? (Sim/Não) ");
        String valorTerca = teclado.nextLine();
        boolean resultadoTerca = valorTerca.equalsIgnoreCase("sim");

        System.out.print("Trabalho de quinta? (Sim/Não) ");
        String valorQuinta = teclado.nextLine();
        boolean resultadoQuinta = valorQuinta.equalsIgnoreCase("sim");

        boolean comprarTV65 = resultadoTerca && resultadoQuinta;

        boolean comprarTV32 = resultadoTerca ^ resultadoQuinta; // Equivalente !=

        boolean comprarSorvete = resultadoTerca || resultadoQuinta;

        boolean ficarEmCasa = !comprarSorvete;

        System.out.printf("Comprar TV 65: %b %ncomprar TV 32: %b %ncomprar Sorvete: %b %nficar em casa: %b", comprarTV65, comprarTV32, comprarSorvete, ficarEmCasa);



        /*
            equalsIgnoreCase() — e ela serve para comparar duas strings ignorando letras maiúsculas e minúsculas
        */
    }
}
