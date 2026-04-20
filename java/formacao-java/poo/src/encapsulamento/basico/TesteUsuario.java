package encapsulamento.basico;

public class TesteUsuario {

    static void main() {

        Usuario usuario = new Usuario();
        
        usuario.setNome("Vitor Hugo");
        usuario.setEmail("vitor@gmail.com");

        IO.println(usuario.getId());
        IO.println(usuario.getNome());
        IO.println("teste funcionando");
    }
}