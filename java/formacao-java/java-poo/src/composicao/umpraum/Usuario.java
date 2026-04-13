package composicao.umpraum;

import java.util.Objects;

public class Usuario {
    int id;
    String nome;
    String email;
    Senha senha;

    public Usuario(int id, String nome, String email) {
        this(id, nome, email, null);
    }

    public Usuario(int id, String nome, String email, Senha senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome='" + nome + '\'' + ", email='" + email + '\'' + ", senha=" + senha + '}';
    }
}