package encapsulamento.basico.carro.model;

public class TesteCarro {
    static void main() {
        Carro carro = new Carro(2.4, 245);
        carro.ligar();

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        
        IO.println(carro);

        carro.frear();
        carro.frear();

        IO.println(carro);
    }
}
