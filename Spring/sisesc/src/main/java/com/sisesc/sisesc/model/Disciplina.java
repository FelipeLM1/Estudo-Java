package com.sisesc.sisesc.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "TB_DISCIPLINA")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDisciplina;

    @NotBlank
    private String nomeDisciplina;

    private Long idCursoDisciplina;

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Long getIdCursoDisciplina() {
        return idCursoDisciplina;
    }

    public void setIdCursoDisciplina(Long idCursoDisciplina) {
        this.idCursoDisciplina = idCursoDisciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "idDisciplina=" + idDisciplina +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", idCursoDisciplina=" + idCursoDisciplina +
                '}';
    }
}
