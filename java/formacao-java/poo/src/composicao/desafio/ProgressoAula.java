package composicao.desafio;

import java.util.UUID;

public class ProgressoAula {
    UUID id;
    Aula aula;
    boolean concluida;

    public ProgressoAula(Aula aula) {
        this(aula, false);
    }

    public ProgressoAula(Aula aula, boolean concluida) {
        this(UUID.randomUUID(), aula, concluida);
    }

    public ProgressoAula(UUID id, Aula aula, boolean concluida) {
        this.id = id;
        this.aula = aula;
        this.concluida = concluida;
    }
}
