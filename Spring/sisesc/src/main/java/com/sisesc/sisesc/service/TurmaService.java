package com.sisesc.sisesc.service;

import com.sisesc.sisesc.model.Turma;

import java.util.List;

public interface TurmaService {

    List<Turma> findAll();

    Turma findById(long idTurma);

    Turma save(Turma turma);

    void deleteById(Long idTurma);

    Turma getOne(Long idTurma);

}
