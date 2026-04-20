package heranca.jogo.model;

public class Heroi extends Jogador{
   
    public Heroi() {}

    public Heroi(int x, int y) {
        super(x, y, 3, 1.5, "Heroi");
    }

    @Override
    public String gritar() {
        return "Aaaaaaaahhhhhhhh";
    }

}
