package colecoes;

import java.util.Objects;

// Entidade em modelagem de aplicação -> são objetos que possuem uma identidade(tem um ID)
public class Usuario {
    int id;
    String nome;

    Usuario() {}

    Usuario(int id) {
        this(id, "");
    }

    Usuario(int id,String nome) {
        this.id = id;
        this.nome = nome;
    }
 
    // toString -> forma de representar o objeto quando você pedir para ele imprimir no console
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome='"+ nome + '\'' + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Usuario usuario = (Usuario) object;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
