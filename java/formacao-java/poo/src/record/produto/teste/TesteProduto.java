package record.produto.teste;

import record.produto.model.Produto;

public class TesteProduto {
    
    static void main() {
        Produto p1 = new Produto("Steam Machine", 6500, 0.40);
        Produto p2 = p1.withNome("Steam Machine 2026");

        IO.println(p1.preco());
        IO.println(p1.precoComDesconto());

        IO.println(p1.nome());
        IO.println(p2.nome());
        IO.println(p2.preco());
        IO.println(p2.precoComDesconto());

        IO.println(p2.withDescono(0.2));
        IO.println(p2.withPreco(8000));
    }
}
