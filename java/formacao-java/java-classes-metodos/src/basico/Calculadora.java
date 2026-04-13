package basico;

public class Calculadora {
    double memoria = 0;
    
    int somar(int a, int b) {
        int resultado = a + b;
        memoria = resultado;
        return resultado;
    }

    double somar(double a, double b) {
        double resultado = a + b;
        memoria = resultado;
        return resultado;
    }

    double somar(double a) {
        double resultado = a + memoria;
        memoria = resultado;
        return resultado;
    }

    double memoriaAoQuadrado() {
        double resultado = Math.pow(memoria, 2);
        memoria = resultado;
        return resultado;
    }

    void limparMemoria() {
        memoria = 0;
    }
}
