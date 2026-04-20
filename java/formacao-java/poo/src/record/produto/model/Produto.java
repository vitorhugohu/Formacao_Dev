package record.produto.model;

public record Produto(String nome, double preco, double desconto) {
    
    public Produto {
        if(nome == null || nome.isBlank()) {
            throw new RuntimeException("Nome não pode ser vazio!");
        }

        if(preco <= 0) {
            throw new RuntimeException("Preço não pode ser zero ou negativo!");
        }

        
        if(desconto < 0 || desconto > 0.6) {
            throw new RuntimeException("Desconto inválido!");
        }
    }

    public Produto withNome(String nome) {
        return new Produto(nome, preco, desconto());
    }

    public Produto withPreco(double preco) {
        return new Produto(nome, preco, desconto());
    }

    public Produto withDescono(double desconto) {
        return new Produto(nome, preco, desconto);
    }

    public double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
