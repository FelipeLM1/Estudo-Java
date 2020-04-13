package com.sisesc.sisesc.service;

import com.sisesc.sisesc.model.Livro;

import java.util.List;

public interface LivroService {

    List<Livro> findAll();

    Livro findById(long idLivro);

    Livro save(Livro livro);

    void deleteById(Long idLivro);

    Livro getOne(Long idLivro);
}
