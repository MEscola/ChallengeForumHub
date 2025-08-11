package com.alura.ForumHub.domain.respostas;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import com.alura.ForumHub.domain.topicos.Topico;
import com.alura.ForumHub.domain.usuario.Usuario;

@Entity(name = "Resposta")
@Table(name = "resposta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String mensagem;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    private LocalDateTime data = LocalDateTime.now();

}