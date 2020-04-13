package com.sisesc.sisesc.service;
import com.sisesc.sisesc.model.Disciplina;

import java.util.List;

public interface DisciplinaService {

    List<Disciplina> findAll();

    Disciplina findById(Long idDisciplina);

    Disciplina save(Disciplina disciplina);

    void deleteById(Long idDisciplina);
}
