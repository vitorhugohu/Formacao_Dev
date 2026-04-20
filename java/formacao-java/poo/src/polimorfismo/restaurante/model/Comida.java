package polimorfismo.restaurante.model;

public abstract class Comida {
    private final String nome;
    private final double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}