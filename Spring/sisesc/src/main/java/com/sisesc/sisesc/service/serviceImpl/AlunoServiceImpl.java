package com.sisesc.sisesc.service.serviceImpl;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.repository.AlunoRepository;
import com.sisesc.sisesc.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno findById(Long idAluno) {
        return alunoRepository.findById(idAluno).get();
    }

    @Override
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteById(Long idAluno) {
        alunoRepository.deleteById(idAluno);
    }
}
