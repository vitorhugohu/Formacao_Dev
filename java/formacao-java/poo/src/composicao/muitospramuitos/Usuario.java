package composicao.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    int id;
    String nome;
    String email;
    final List<Perfil> perfis = new ArrayList<>();

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome='" +
        nome + '\'' + ", email='" + email + '\'' + ", perfis=" + perfis + '}';
    }
}
