package com.alura.ForumHub.domain.topicos;

import java.time.LocalDateTime;

import com.alura.ForumHub.domain.respostas.StatusResposta;

public record DadosListagemTopicos(
        Long id,
        String autor,
        String titulo,
        String mensagem,
        LocalDateTime data,
        StatusResposta status
) {

    public DadosListagemTopicos(Topico topico) {

        this(   topico.getId(),
                topico.getAutor().getNome(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getData(),
                topico.getStatus()
        );

    }
}