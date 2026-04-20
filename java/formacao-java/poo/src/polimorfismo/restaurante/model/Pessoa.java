package polimorfismo.restaurante.model;

public class Pessoa {
    private final String nome;
    private double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    } 

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso; 
    }

    public void comer(Comida comida) {
        peso += comida.getPeso();
    }
}