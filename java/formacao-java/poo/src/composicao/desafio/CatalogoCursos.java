package composicao.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CatalogoCursos {

    private final List<Curso> cursos = new ArrayList<>();

    public CatalogoCursos() {
        cursos.add(criarCursoJava());
        cursos.add(criarCursoReact());
        cursos.add(criarCursoJavaScript());
    }

    public List<Curso> listarTodos() {
        return Collections.unmodifiableList(cursos);
    }

    public Optional<Curso> buscarPorNome(String nome) {
        return cursos.stream()
                .filter(c -> c.nome.equalsIgnoreCase(nome))
                .findFirst();
    }

    // -------------------- Cursos de exemplo --------------------

    private Curso criarCursoJava() {
        Curso java = new Curso("Java Essencial");

        Modulo fundamentos = new Modulo("Fundamentos de Java");
        fundamentos.aulas.add(new Aula("Introdução ao Java", 600));
        fundamentos.aulas.add(new Aula("Tipos primitivos e variáveis", 900));
        fundamentos.aulas.add(new Aula("Estruturas de controle", 900));

        Modulo poo = new Modulo("Programação Orientada a Objetos");
        poo.aulas.add(new Aula("Classes e Objetos", 900));
        poo.aulas.add(new Aula("Encapsulamento e construtores", 900));
        poo.aulas.add(new Aula("Composição e agregação", 900));

        java.modulos.add(fundamentos);
        java.modulos.add(poo);

        return java;
    }

    private Curso criarCursoReact() {
        Curso react = new Curso("React Completo");

        Modulo fundamentos = new Modulo("Fundamentos do React");
        fundamentos.aulas.add(new Aula("Introdução ao React", 600));
        fundamentos.aulas.add(new Aula("Componentes e props", 900));

        Modulo avancado = new Modulo("React avançado");
        avancado.aulas.add(new Aula("Hooks", 900));
        avancado.aulas.add(new Aula("Gerenciamento de estado", 900));
        avancado.aulas.add(new Aula("Consumo de APIs", 900));

        react.modulos.add(fundamentos);
        react.modulos.add(avancado);

        return react;
    }

    private Curso criarCursoJavaScript() {
        Curso js = new Curso("JavaScript Moderno");

        Modulo fundamentos = new Modulo("Fundamentos de JavaScript");
        fundamentos.aulas.add(new Aula("Variáveis, let e const", 900));
        fundamentos.aulas.add(new Aula("Funções e escopo", 900));

        Modulo avancado = new Modulo("JavaScript no dia a dia");
        avancado.aulas.add(new Aula("Arrays e métodos mais usados", 900));
        avancado.aulas.add(new Aula("Objetos e JSON", 900));
        avancado.aulas.add(new Aula("Introdução a callbacks e promises", 900));

        js.modulos.add(fundamentos);
        js.modulos.add(avancado);

        return js;
    }
}