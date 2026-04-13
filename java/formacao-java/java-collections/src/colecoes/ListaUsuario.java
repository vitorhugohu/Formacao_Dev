package colecoes;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class ListaUsuario {
    static void main() {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario(1, "Vitor");

        lista.add(u1);
        lista.add(new Usuario(2, "Larisse"));
        lista.add(new Usuario(3, "Alexandre"));
        lista.add(new Usuario(4, "Nicolas"));

        IO.println(lista.get(3)); // pega um elemento pelo indice

        IO.println(">>>> " + lista.remove(1)); // remove um elemento pelo indice
        IO.println(lista.remove(new Usuario(6, "Bla bla")));

        IO.println("Tem? " + lista.contains(new Usuario(1)));

        for(Usuario usuario: lista) {
            IO.println(usuario);
        }
    }
}
