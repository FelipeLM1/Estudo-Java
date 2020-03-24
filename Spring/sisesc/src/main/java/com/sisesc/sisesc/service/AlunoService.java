package com.sisesc.sisesc.service;

import com.sisesc.sisesc.model.Aluno;

import java.util.List;

public interface AlunoService {

    List<Aluno> findAll();
    Aluno findById(long idAluno);
    Aluno save(Aluno aluno);
}
