package basico;

public class ProdutoTeste {
    
    static void main() {
        Produto p1 = new Produto();
        p1.id = 1;
        p1.nome = "Notebook";
        p1.preco = 4500.00;
        p1.desconto = 0.15;

        Produto p2 = new Produto();
        p2.id = 2;
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoComDesconto1 = p1.preco * (1 - p1.desconto);
        double precoComDesconto2 = p2.preco * (1 - p2.desconto);

        System.out.printf("O preço do %s com desconto é R$ %.2f\n", p1.nome, precoComDesconto1);
        System.out.printf("O preço do %s com desconto é R$ %.2f", p2.nome, precoComDesconto2);

        System.out.println(p1);
    }
}
