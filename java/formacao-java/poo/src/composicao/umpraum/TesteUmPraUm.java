package composicao.umpraum;

public class TesteUmPraUm {
    static void main() {
        Senha senha = new Senha(1, "#Senha123");

        Usuario usuario = new Usuario(3, "Vitor", "vitor@gmail.com", senha);

        IO.println(usuario.senha.valor);
    }
}
