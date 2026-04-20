package heranca.carros.model;

public abstract class Carro {
    private final String nome;
    protected double velocidadeAtual = 0;

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual -= 10;

        if(velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }
}