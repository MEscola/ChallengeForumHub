package com.alura.ForumHub.domain.respostas;

import java.util.List;

import com.alura.ForumHub.domain.curso.DadosCurso;
import com.alura.ForumHub.domain.topicos.Topico;

public record DadosDetalhadoRespostas(

        Long id,
        String titulo,
        String mensagem,
        String nomeAutor,
        DadosCurso curso,
        StatusResposta status,
        List<DadosListagemRespostas> respostas
) {

    public DadosDetalhadoRespostas(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getAutor().getNome(),
                new DadosCurso(topico.getCurso()),
                topico.getStatus(),
                topico.getRespostas().stream().map(DadosListagemRespostas::new).toList()
        );
    }

}