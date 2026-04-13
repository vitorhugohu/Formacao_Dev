package basico;

public class Produto {
    int id;
    String nome;
    double preco;
    double desconto;

    @Override
    public String toString() {
        return String.format("Produto: %d - %s - R$ %.2f (Desconto: %.2f%%)", this.id, this.nome, this.preco, this.desconto);
    }
}
