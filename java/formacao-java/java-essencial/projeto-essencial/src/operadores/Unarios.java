package operadores;

public class Unarios {
    static void main() {
        int a = 1;
        int b = 2;

        // a = a + 1;
        // a += 1;
        a++;
        --a;

        b++;
        --b;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(++a == b--); // true
        System.out.println(a == b); // false

        System.out.println(a);
        System.out.println(b);
    }
}
