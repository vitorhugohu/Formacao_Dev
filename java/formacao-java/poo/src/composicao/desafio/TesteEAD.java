package composicao.desafio;

public class TesteEAD {
    static void main() {
        CatalogoCursos catalogo = new CatalogoCursos();
        Curso curso = catalogo.listarTodos().getFirst();

        Aluno aluno = new Aluno("João Pedro", "jp@email.com");

        InscricaoCurso novaInscricao = new InscricaoCurso(curso, aluno);
        novaInscricao.progressos.add(new ProgressoAula(curso.modulos.getFirst().aulas.getFirst(), true));

        novaInscricao.progressos.add(new ProgressoAula(curso.modulos.getFirst().aulas.get(1), true));

        IO.println(curso.nome);
        IO.println(curso.getDuracaoTotal());

        IO.println(novaInscricao.progressos.size());
    }
}
