package heranca.jogo.teste;

import heranca.jogo.model.Heroi;
import heranca.jogo.model.Jogador;
import heranca.jogo.model.Monstro;

public class TesteJogo {
    static void main() {
        Jogador heroi = new Heroi(21, 50);
        Jogador monstro = new Monstro(23, 50);

        boolean heroiAcertou = heroi.atacar(monstro);
        IO.println(heroiAcertou ? heroi.gritar() : "");

        boolean monstroAcertou = monstro.atacar(heroi);
        IO.println(monstroAcertou ? monstro.gritar() : "");

        IO.println(heroi);
        IO.println(monstro);
    }
}
