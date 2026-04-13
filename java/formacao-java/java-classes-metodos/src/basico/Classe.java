package basico;

public class Classe {
    String nome;
    static int status = 3;

    void teste() {
        System.out.printf("%s %d", nome, status);
    }

    static void xyz() {
         System.out.printf("%d\n", status);
    }
}
