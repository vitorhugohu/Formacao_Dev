package composicao.umpraum;

import java.util.Objects;

public class Senha {
    int id;
    String valor;

    public Senha(int id, String valor) {
        this.id = id;
        this.valor = valor;
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
        return "Senha{" + "id=" + id + ", valor='" + valor + '\'' + '}';
    }
}
