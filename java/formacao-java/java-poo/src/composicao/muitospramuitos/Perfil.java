package composicao.muitospramuitos;

public class Perfil {
    int id;
    String nome;

    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
