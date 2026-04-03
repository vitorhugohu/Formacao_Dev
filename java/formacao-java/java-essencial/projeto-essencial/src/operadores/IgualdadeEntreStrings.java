package operadores;

import java.util.Scanner;

public class IgualdadeEntreStrings {
    static void main() {
        System.out.println("olá" == "olá");
        System.out.println("olá" == new String("olá"));
        System.out.println("olá".equals(new String("olá")));
    }
}
