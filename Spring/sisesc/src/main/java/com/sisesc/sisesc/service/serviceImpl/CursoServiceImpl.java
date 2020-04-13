package com.sisesc.sisesc.service.serviceImpl;

import com.sisesc.sisesc.model.Curso;
import com.sisesc.sisesc.repository.CursoRepository;
import com.sisesc.sisesc.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findById(Long idCurso) {
        return cursoRepository.findById(idCurso).get();
    }

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteById(Long idCurso) {
        cursoRepository.deleteById(idCurso);
    }
}

