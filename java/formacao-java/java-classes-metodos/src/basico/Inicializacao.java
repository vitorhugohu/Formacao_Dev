package basico;

public class Inicializacao {
    
    int a;

    void metodoA() {
        int b = 0;

        IO.println(a);
        IO.println(b);
    }

    static void main() {
        Inicializacao init = new Inicializacao();
        init.metodoA();
    }
}
