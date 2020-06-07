package com.filmes.filmesapi.controller;

import javax.validation.Valid;

import com.filmes.filmesapi.model.Filme;
import com.filmes.filmesapi.repository.FilmeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class filmeController {

    @Autowired
    private FilmeRespository filmeRespository;

    @GetMapping("filme")
    public List<Filme> Get() {
        return filmeRespository.findAll();
    }

    @GetMapping("filme/{id}")
    public ResponseEntity<Filme> GetById(@PathVariable(value = "id") Long id) {
        Optional<Filme> filme = filmeRespository.findById(id);
        if (filme.isPresent()) {
            return new ResponseEntity<Filme>(filme.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("filme")
    public Filme Post(@Valid @RequestBody Filme filme) {
        return filmeRespository.save(filme);
    }

    @PutMapping("filme/{id}")
    public ResponseEntity<Filme> Put(@PathVariable(value = "id") Long id, @Valid @RequestBody Filme newFilme) {
        Optional<Filme> oldFilme = filmeRespository.findById(id);
        if (oldFilme.isPresent()) {
            Filme filme = oldFilme.get();
            filme.setNomeDoFilme(newFilme.getNomeDoFilme());
            filme.setAnoFilme(newFilme.getAnoFilme());
            filme.setDescricaoFilme(newFilme.getDescricaoFilme());
            filme.setLinkImg(newFilme.getLinkImg());
            filmeRespository.save(filme);
            return new ResponseEntity<Filme>(filme, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("filme/{id}")
    public ResponseEntity<Filme> Delete(@PathVariable(value = "id") Long id) {
        Optional<Filme> filme = filmeRespository.findById(id);
        if (filme.isPresent()) {
            filmeRespository.delete(filme.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}

