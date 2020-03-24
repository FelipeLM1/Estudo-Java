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

    private Livro[] livrosEmprestados = new Livro[3];

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

    public Livro[] getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Livro[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
