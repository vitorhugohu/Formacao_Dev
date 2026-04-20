package heranca.carros.teste;

import heranca.carros.model.Ferrari;

public class TesteCarros {
    
    static void main() {
        Ferrari ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.acelerar();

        ferrari.ligarArCondicionado();
        ferrari.ligarTurbo();

        ferrari.acelerar();
        ferrari.acelerar();

        IO.println(ferrari.getVelocidadeAtual());
    }
}
