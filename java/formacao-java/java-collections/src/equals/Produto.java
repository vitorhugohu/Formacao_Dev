package equals;

import java.util.Objects;

public class Produto {
    int id;
    String nome;

    Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /*@Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Produto produto)) {
            return false;
        }

        boolean mesmoId = id == produto.id;
        boolean mesmoNome = nome.equals(produto.nome);
        return mesmoId && mesmoNome;
    } */

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // Equals define a lógica da igualdade entre uma //comparação de igualdade entre dois objetos 

    // hashcode é um método chamado antes do equals, usado para encontrar os elementos de forma rápida, já que o equals leva mais tempo.
}