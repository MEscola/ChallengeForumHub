package com.alura.ForumHub.domain;

import jakarta.validation.constraints.NotBlank;

public record DadosConfirmarSenha(@NotBlank String senha) {
}