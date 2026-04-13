package basico;

public class CalculadoraTeste {
    static void main() {
        Calculadora calc = new Calculadora();
        double r = calc.somar(3, 2.2);
        System.out.println(r);

        calc.limparMemoria();

        r = calc.somar(100);
        System.out.println(r);

        r = calc.memoriaAoQuadrado();
        System.out.println(r);
    }
}
