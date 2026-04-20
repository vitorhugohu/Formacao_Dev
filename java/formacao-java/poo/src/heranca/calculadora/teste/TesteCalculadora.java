package heranca.calculadora.teste;

import heranca.calculadora.model.CalculadoraHP;

public class TesteCalculadora {
    
    static void main() {
        CalculadoraHP hp = new CalculadoraHP();
        IO.println(hp.somar(3, 4));
        IO.println(hp.subtrair(3, 4));

        IO.println(CalculadoraHP.PI);
    }
}
