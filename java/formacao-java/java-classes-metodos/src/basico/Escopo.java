package basico;

public class Escopo {
    int a = 2;

    void metodoA() {
        IO.println(a);

        int b = 7;
        IO.println(b);
    }
}