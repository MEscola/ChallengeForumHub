package com.alura.ForumHub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizarSenha(@NotBlank String novaSenha) {
}