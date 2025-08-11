package com.alura.ForumHub.domain.curso;

public record DadosCurso(
        String nome,
        String categoria
) {

    public DadosCurso(Curso curso) {
        this(
                curso.getNome(),
                curso.getCategoria()
        );
    }
}