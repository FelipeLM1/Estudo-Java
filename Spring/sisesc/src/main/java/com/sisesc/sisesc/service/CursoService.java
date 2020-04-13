package com.sisesc.sisesc.service;
import com.sisesc.sisesc.model.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> findAll();

    Curso findById(Long idCurso);

    Curso save(Curso curso);

    void deleteById(Long idCurso);
}

