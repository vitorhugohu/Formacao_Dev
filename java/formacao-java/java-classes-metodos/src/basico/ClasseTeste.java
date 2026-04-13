package basico;

public class ClasseTeste {
    static void main() {
        Classe c1 = new Classe();
        c1.nome = "Teste";
        IO.println(c1.nome);
        IO.println(Classe.status);
        c1.teste();

        Classe c2 = new Classe();
        c2.nome = "Teste 2";
        IO.println(c2.nome);
        c2.teste();

        IO.println(Classe.status);
        Classe.xyz();
    }
}
