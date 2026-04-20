package polimorfismo.restaurante.teste;

import polimorfismo.restaurante.model.Arroz;
import polimorfismo.restaurante.model.Comida;
import polimorfismo.restaurante.model.Feijao;
import polimorfismo.restaurante.model.Pessoa;
import polimorfismo.restaurante.model.Sorvete;
import polimorfismo.restaurante.model.Tapioca;

public class TesteRestaurante {
    static void main() {
        Pessoa p1 = new Pessoa("Jurema", 62.3);

        Comida c1 = new Arroz(0.200);
        Comida c2 = new Feijao(0.300);
        Comida c3 = new Sorvete(0.600);
        Comida c4 = new Tapioca(0.600);

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);
        p1.comer(c4);

        IO.println(p1.getPeso());
    }
}
