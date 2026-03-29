package fundamentos;

import javax.swing.*;

public class ConversaoStringParaNumero {
    
    static void main() {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        int n1 = Integer.parseInt(valor1);

        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
        int n2 = Integer.parseInt(valor2);
        
        int soma = n1 + n2;
        
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.printf("%d + %d = %d", n1, n2, soma);
    }

}
