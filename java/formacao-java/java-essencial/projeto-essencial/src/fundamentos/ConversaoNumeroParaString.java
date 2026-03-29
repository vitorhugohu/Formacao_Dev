package fundamentos;

public class ConversaoNumeroParaString {
    
    static void main() {
        int n1 = 12345;
        int n2 = 562663;

        String s1 = n1 + "";
        String s2 = n2 + "";

        System.out.println(s1 + s2);

        Integer n3 = 1234;
        System.out.println(n3.toString());

        System.out.println(String.format("%d", n1));
    }

}
