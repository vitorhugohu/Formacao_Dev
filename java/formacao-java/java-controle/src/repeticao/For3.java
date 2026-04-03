package repeticao;

public class For3 {
    static void main() {
        for(int linha = 0; linha < 10; linha++) {
            

            for(int coluna = 0; coluna < 10; coluna++) {
                System.out.printf("%dx%d ", linha + 1, coluna + 1);
            }

            System.out.println();
        }
    }
}
