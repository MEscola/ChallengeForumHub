package com.alura.ForumHub.domain.respostas;

import jakarta.validation.constraints.NotBlank;

public record DadosResposta(@NotBlank String mensagem) {
}