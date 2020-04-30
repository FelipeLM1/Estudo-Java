package com.sisesc.sisesc.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "TB_TURMA")
public class Turma implements Comparable<Turma> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(idTurma, turma.idTurma) &&
                Arrays.equals(idAlunos, turma.idAlunos) &&
                Objects.equals(idDisciplina, turma.idDisciplina);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idTurma, idDisciplina);
        result = 31 * result + Arrays.hashCode(idAlunos);
        return result;
    }

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
