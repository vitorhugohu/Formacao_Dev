package composicao.muitospramuitos;

public class TesteMuitosPraMuitos {
    
    static void main() {
        Perfil admin = new Perfil(1, "Admin");
        Perfil aluno = new Perfil(2, "Aluno");

        Usuario u1 = new Usuario(1, "João Pedro", "jp@email.com");
        Usuario u2 = new Usuario(2, "Maria Paula", "mp@email.com");

        u1.perfis.add(admin);
        u1.perfis.add(aluno);

        u2.perfis.add(admin);
        u2.perfis.add(aluno);

        IO.println(u1);
        IO.println(u2);
    }
}
