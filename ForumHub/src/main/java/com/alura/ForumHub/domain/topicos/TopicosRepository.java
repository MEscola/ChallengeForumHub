package com.alura.ForumHub.domain.topicos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.ForumHub.domain.usuario.Usuario;

public interface TopicosRepository extends JpaRepository<Topico, Long> {

    int countByAutor(Usuario enviados);

}