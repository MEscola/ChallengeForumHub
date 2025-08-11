package com.alura.ForumHub.domain.topicos;

import java.time.LocalDateTime;

import com.alura.ForumHub.domain.curso.DadosCurso;
import com.alura.ForumHub.domain.respostas.StatusResposta;

public record DadosDetalhamentoTopicos(
        Long id,
        String autor,
        String titulo,
        String mensagem,
        DadosCurso curso,
        LocalDateTime data,
        StatusResposta status
) {

    public DadosDetalhamentoTopicos(Topico topico) {

        this(   topico.getId(),
                topico.getAutor().getNome(),
                topico.getTitulo(),
                topico.getMensagem(),
                new DadosCurso(topico.getCurso()),
                topico.getData(),
                topico.getStatus()
        );

    }
}