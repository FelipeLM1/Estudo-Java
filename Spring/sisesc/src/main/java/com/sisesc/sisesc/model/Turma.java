package com.sisesc.sisesc.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TB_TURMA")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    private int quantidadeDeAluno;

    private Long[] idAlunos = new Long[quantidadeDeAluno];

    @NotEmpty
    private Long idDisciplina;

    //private Professor professor;
    //private Local local;

}
