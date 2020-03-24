package com.sisesc.sisesc.service.serviceImpl;

import com.sisesc.sisesc.model.Livro;
import com.sisesc.sisesc.repository.LivroRepository;
import com.sisesc.sisesc.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    LivroRepository livroRepository;

    @Override
    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    @Override
    public Livro findById(long idLivro) {
        return livroRepository.findById(idLivro).get();
    }

    @Override
    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }
}
