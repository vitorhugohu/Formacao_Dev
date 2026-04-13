package equals;

public class ProdutoTeste {
    static void main() {
        Produto p1 = new Produto(123, "Caneta");
        Produto p2 = new Produto(123, "Caneta");

        IO.println(p1 == p2);
        IO.println(p1.equals(p2));

        IO.println(p1.equals(p2));

        IO.println(p1.hashCode());
        IO.println(p1.toString());

        IO.println(Integer.parseInt("7b", 16));
    }
}