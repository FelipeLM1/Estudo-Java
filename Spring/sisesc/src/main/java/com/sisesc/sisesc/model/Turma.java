package com.sisesc.sisesc.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "TB_TURMA")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    private int quantidadeDeAluno;

    private Aluno[] alunosMatriculados = new Aluno[quantidadeDeAluno];

    @NotEmpty
    private Disciplina disciplina;


    //private Professor professor;
    //private Local local;





}
