package composicao.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InscricaoCurso {
    UUID id;
    Curso curso;
    Aluno aluno;
    final List<ProgressoAula> progressos = new ArrayList<>();

    public InscricaoCurso(Curso curso, Aluno aluno) {
        this(UUID.randomUUID(), curso, aluno);
    }

    public InscricaoCurso(UUID id, Curso curso, Aluno aluno) {
        this.id = id;
        this.curso = curso;
        this.aluno = aluno;
    }
}
