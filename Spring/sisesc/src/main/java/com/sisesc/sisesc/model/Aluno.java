package com.sisesc.sisesc.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TB_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAluno;

    @NotBlank
    private String nome;

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
