package condicionais;

import java.util.Scanner;

public class Switch2 {
    static void main() {    
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a nota: ");
        double nota = teclado.nextDouble();

        switch ((int) nota) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
                System.out.println("D");
                break;
            case 1:
            case 2:
                System.out.println("E");
                break;
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Não encontrado");
        }
        System.out.println("Fim do programa");
    }
}
