package com.alura.ForumHub.domain.respostas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.ForumHub.domain.usuario.Usuario;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {

    List<Resposta> findAllByTopicoId(Long topicoId);

    int countByAutor(Usuario autor);

}