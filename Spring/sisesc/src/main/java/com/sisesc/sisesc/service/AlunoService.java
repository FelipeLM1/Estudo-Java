package com.sisesc.sisesc.service;

import com.sisesc.sisesc.model.Aluno;

import java.util.List;

public interface AlunoService {

    List<Aluno> findAll();

    Aluno findById(Long idAluno);

    Aluno save(Aluno aluno);

    void deleteById(Long id);
}
