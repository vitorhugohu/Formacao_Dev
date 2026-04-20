package heranca.jogo.model;

public abstract class Jogador {
    private final String nome;
    private int x = 0;
    private int y = 0;
    private int passo = 1;
    private double vida = 100;
    private double forca = 0.5;

    public Jogador() {
        this(0, 0, 1, 0.5, "Jogador");
    }

    public Jogador(int x, int y) {
        this(x, y, 1, 0.5, "Jogador");
    }

    public Jogador(int x, int y, int passo, double forca, String nome) {
        this.x = x;
        this.y = y;
        this.passo = passo;
        this.forca = forca;
        this.nome = nome;
    }

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        boolean ataqueVertical = deltaX == 0 && deltaY <= passo;
        boolean ataqueHorizontal = deltaY == 0 && deltaX <= passo;

        if(ataqueHorizontal || ataqueVertical) {
            oponente.vida -= forca;
            return true;
        }
        return false;
    }

    public boolean mover(Direcao direcao) {
    
        int xAnterior = x;
        int yAnterior = y;
        if(direcao == Direcao.NORTE) {
            y = Math.max(y - passo, 0);
            return yAnterior != y;
        } else if(direcao == Direcao.SUL) {
            y = Math.min(y + passo, 100);
            return yAnterior != y;
        } else if(direcao == Direcao.OESTE) {
            x = Math.max(x - passo, 0);
            return xAnterior != x;
        } else if(direcao == Direcao.LESTE) {
            x = Math.min(x + passo, 100);
            return xAnterior != x;
        }

        return false;
    }

    public abstract String gritar();

    @Override
    public String toString() {
        return nome + "{" + "x=" + x + ", y=" + y +
        ", vida=" + vida + '}';
    }
}
