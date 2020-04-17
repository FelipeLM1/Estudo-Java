package com.sisesc.sisesc.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Arrays;

@Entity
@Table(name = "TB_TURMA")
public class Turma implements Comparable<Turma>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    private Long[] idAlunos = new Long[30];

    private Long idDisciplina;

    public Long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Long idTurma) {
        this.idTurma = idTurma;
    }

    public Long[] getIdAlunos() {
        return idAlunos;
    }

    public void setIdAlunos(Long[] idAlunos) {
        this.idAlunos = idAlunos;
    }

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "idTurma=" + idTurma +
                ", idAlunos=" + Arrays.toString(idAlunos) +
                ", idDisciplina=" + idDisciplina +
                '}';
    }

    @Override
    public int compareTo(Turma o) {
        return this.idTurma.compareTo(o.idTurma);
    }

    //private Professor professor;
    //private Local local;

}
