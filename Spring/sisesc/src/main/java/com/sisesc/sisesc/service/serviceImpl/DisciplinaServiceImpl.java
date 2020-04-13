package com.sisesc.sisesc.service.serviceImpl;

import com.sisesc.sisesc.model.Disciplina;
import com.sisesc.sisesc.repository.DisciplinaRepository;
import com.sisesc.sisesc.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DisciplinaServiceImpl implements DisciplinaService {


    @Autowired
    DisciplinaRepository disciplinaRepository;

    @Override
    public List<Disciplina> findAll() {
        return disciplinaRepository.findAll();
    }

    @Override
    public Disciplina findById(Long idDisciplina) {
        return disciplinaRepository.findById(idDisciplina).get();
    }

    @Override
    public Disciplina save(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public void deleteById(Long idDisciplina) {
        disciplinaRepository.deleteById(idDisciplina);
    }
}
