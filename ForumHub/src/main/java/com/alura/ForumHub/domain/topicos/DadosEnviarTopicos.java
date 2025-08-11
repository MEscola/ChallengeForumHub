package com.alura.ForumHub.domain.topicos;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DadosEnviarTopicos(

        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotBlank
        String curso,

        LocalDateTime data
) {
}