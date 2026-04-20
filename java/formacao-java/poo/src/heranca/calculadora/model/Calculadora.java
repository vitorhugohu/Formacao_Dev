package heranca.calculadora.model;

public interface Calculadora {
    double PI = 3.14;

    default int somar(int a, int b) {
        return a + b;
    }
    
    default int subtrair(int a, int b) {
        validar(a, b);
        return a - b;
    }

    private void validar(int a, int b) {
        if(a < 0 || b < 0) {
            throw new RuntimeException("Números negativos");
        }
    }
}
