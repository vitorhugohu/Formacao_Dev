package heranca.carros.model;

public class Ferrari extends Carro implements CarroLuxo, CarroEsportivo {
    private boolean arCondicionadoLigado = false;
    private boolean turboLigado = false;
    
    public Ferrari() {
        super("Ferrari");
    }

    @Override
    public void acelerar() {
        velocidadeAtual += turboLigado ? 50 : 30;
    }

    @Override
    public void ligarArCondicionado() {
        arCondicionadoLigado = true;
    }

    @Override
    public void desligarArCondicionado() {
        arCondicionadoLigado = false;
    }

    @Override
    public void ligarTurbo() {
        turboLigado = true;
    }

    @Override
    public void desligarTurbo() {
        turboLigado = false;
    }
}
