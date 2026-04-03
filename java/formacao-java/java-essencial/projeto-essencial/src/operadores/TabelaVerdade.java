package operadores;

public class TabelaVerdade {
    static void main () {
        // Tabela verdade AND
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // Tabela verdade OR 
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // Tabela verdade XOR (ou exclusivo) v1
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true 
        System.out.println(false ^ true);  // true
        System.out.println(false ^ false); // false

         // Tabela verdade XOR (ou exclusivo) v1
        System.out.println(true != true); // false
        System.out.println(true != false); // true
        System.out.println(false != true); // true
        System.out.println(false != false); // false

        // Tabela verdade NOT
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}
