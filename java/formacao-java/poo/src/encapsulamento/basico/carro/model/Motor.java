package encapsulamento.basico.carro.model;

class Motor {
    private final double litragem;
    private boolean ligado;

    Motor(double litragem) {
        this.litragem = litragem;
    }

    void ligar() {
        ligado = true;
    }

    void desligar() {
        ligado = false;
    }

    double getFatorAceleracao() {
        return 0.9 * litragem;
    }

    public double getLitragem() {
        return litragem;
    }

    public boolean isLigado() {
        return ligado;
    }
}