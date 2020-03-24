package com.sisesc.sisesc.repository;

import com.sisesc.sisesc.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}
