package fundamentos;

public class ObjetoVsPrimitivos {
    
    static void main() {
        int a = 10;
        System.out.println(a);

        String b = "Texto";
        System.out.println(b.toUpperCase());

        // Wrappers -> São classes que vai envolver um conteúdo, todo tipo primitivo vai ter uma classe wrapper

        /*
            boolean - Boolean,
            char - Character,
            byte - Byte,
            short - Short,
            int - Integer,
            long - Long,
            float - Float,
            double - Double
        */
        Integer c = 1234;
        System.out.println(c.doubleValue());
        
        Double d = 1234.56;
        System.out.println(d.intValue());
    }

}
