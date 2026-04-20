package composicao.desafio;

import java.util.UUID;

public class Aluno {
    UUID id;
    String nome;
    String email;

    public Aluno( String nome, String email) {
        this(UUID.randomUUID(), nome, email);
    }

    public Aluno(UUID id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
}
