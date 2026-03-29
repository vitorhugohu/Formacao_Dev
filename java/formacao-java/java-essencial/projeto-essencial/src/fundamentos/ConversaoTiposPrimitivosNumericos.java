package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    static void main() {
        double a = 1; // Conversão Implícita
        System.out.println(a);

        int b = (int) 1.9999; // Conversão Explícita (CAST)
        System.out.println(b);

        long c = 123457;
        byte d = (byte) c; // Conversão Explícita (CAST)
        System.out.println(d);
    }

}