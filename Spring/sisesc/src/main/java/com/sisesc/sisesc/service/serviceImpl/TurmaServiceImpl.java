package com.sisesc.sisesc.service.serviceImpl;

import com.sisesc.sisesc.model.Turma;
import com.sisesc.sisesc.repository.TurmaRepository;
import com.sisesc.sisesc.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaServiceImpl implements TurmaService {

    @Autowired
    TurmaRepository turmaRepository;

    @Override
    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }

    @Override
    public Turma findById(long idTurma) {
        return turmaRepository.findById(idTurma).get();
    }

    @Override
    public Turma save(Turma turma) {
        return turmaRepository.save(turma);
    }

    public void deleteById(Long id) {
        turmaRepository.deleteById(id);
    }

    @Override
    public Turma getOne(Long idTurma) {
        return turmaRepository.getOne(idTurma);
    }
}
