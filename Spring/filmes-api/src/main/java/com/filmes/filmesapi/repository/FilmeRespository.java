package com.filmes.filmesapi.repository;

import com.filmes.filmesapi.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRespository extends JpaRepository<Filme,Long> {

}
