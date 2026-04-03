package repeticao;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main() {
            Scanner teclado = new Scanner(System.in);

            String comando = "";

            while(!comando.equals("sair")) {
                System.out.print("Informe o comando ou sair: ");
                comando = teclado.nextLine();
                System.out.println("Comando: " + comando);
            }

            teclado.close();    
        }

}
