package repeticao;

public class DoWhile {
    static void main() {
        // 1. Criar uma variável de controle
        int i = 1;

        // 2. Expressão que vai usar a variável
       

        do {
            System.out.println(i);

             // 3. Incrementar a variável até a expressão mudar
             i++;
        } while(i <= 10);

        System.out.println("Fim!");
    }
}
