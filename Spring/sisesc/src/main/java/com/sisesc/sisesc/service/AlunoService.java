package com.sisesc.sisesc.service;

import com.sisesc.sisesc.model.Aluno;

import java.util.List;

public interface AlunoService {

    List<Aluno> findAll();

    Aluno findById(Long idAluno);

    Aluno findByLogin(String login);

    Aluno save(Aluno aluno);

    void deleteById(Long idAluno);
}
