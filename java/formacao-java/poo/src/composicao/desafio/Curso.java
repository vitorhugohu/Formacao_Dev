package composicao.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Curso {
    UUID id; 
    String nome;
    final List<Modulo> modulos = new ArrayList<>();

    public Curso(String nome) {
        this(UUID.randomUUID(), nome);
    }

    public Curso(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    int getDuracaoTotal() {
        int total = 0;
        for(Modulo modulo: modulos) {
            total += modulo.getDuracaoTotal();
        }
        return total;
    }
}