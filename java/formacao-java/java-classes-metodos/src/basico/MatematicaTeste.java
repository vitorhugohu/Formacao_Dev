package basico;

public class MatematicaTeste {
    static void main() {
        var raio = 6.5;
        IO.println(Matematica.PI * raio * raio);
        IO.println(Matematica.PI * Matematica.potencia(raio, 2));
    }
}
