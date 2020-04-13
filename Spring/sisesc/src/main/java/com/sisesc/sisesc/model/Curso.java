package com.sisesc.sisesc.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "TB_CURSO")
public class Curso implements Comparable<Curso>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCurso;

    @NotBlank
    private String nomeCurso;

    private List<Aluno> alunosRegistrados;

    private List<Disciplina> disciplinasRegistradas;

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Aluno> getAlunosRegistrados() {
        return alunosRegistrados;
    }

    public void setAlunosRegistrados(List<Aluno> alunosRegistrados) {
        this.alunosRegistrados = alunosRegistrados;
    }

    public List<Disciplina> getDisciplinasRegistradas() {
        return disciplinasRegistradas;
    }

    public void setDisciplinasRegistradas(List<Disciplina> disciplinasRegistradas) {
        this.disciplinasRegistradas = disciplinasRegistradas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", alunosRegistrados=" + alunosRegistrados +
                ", disciplinasRegistradas=" + disciplinasRegistradas +
                '}';
    }

    @Override
    public int compareTo(Curso o) {
        return this.idCurso.compareTo(o.getIdCurso());
    }
}
