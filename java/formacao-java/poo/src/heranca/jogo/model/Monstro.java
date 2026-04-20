package heranca.jogo.model;

public class Monstro extends Jogador{
    
    public Monstro() {}

    public Monstro(int x, int y) {
        super(x, y, 1, 5, "Monstro");
    }

    @Override
    public String gritar() {
        return "Arrrrrrrrrrhhhhrrr";
    }
}
