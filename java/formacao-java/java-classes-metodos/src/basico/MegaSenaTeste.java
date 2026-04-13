package basico;

public class MegaSenaTeste {
    static void main() {
        MegaSena aposta01 = new MegaSena();
        IO.println(aposta01);

        MegaSena aposta02 = new MegaSena(11, 6, 2, 9, 24, 9);
        IO.println(aposta02);
    }
}
