package com.sisesc.sisesc.utils;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Livro;
import com.sisesc.sisesc.repository.AlunoRepository;
import com.sisesc.sisesc.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {


    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    LivroRepository livroRepository;

    @PostConstruct
    public void saveData() {

        List<Livro> livroList = new ArrayList<>();
        Livro livro1 = new Livro();
        livro1.setTitulo("Fisica 1: Mecanica Geral");
        livro1.setAutor("Halliday");
        livro1.setCategoria("FISICA");
        livro1.setQuantidadeDisponivel(3);

        Livro livro2 = new Livro();
        livro2.setTitulo("Fisica 2: Ondas e Termodinamica");
        livro2.setAutor("Halliday");
        livro2.setCategoria("FISICA");
        livro2.setQuantidadeDisponivel(1);

        Livro livroVazio = new Livro();
        livroVazio.setTitulo(null);
        livroVazio.setQuantidadeDisponivel(0);
        livroVazio.setCategoria(null);
        livroVazio.setAutor(null);


        livroList.add(livro1);
        livroList.add(livro2);

        for(Livro livro: livroList){
            Livro livroSaved = livroRepository.save(livro);
            System.out.println(livroSaved.getIdLivro());
        }

        List<Aluno> alunoList = new ArrayList<>();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Felipe Lima");
        aluno1.setLivrosEmprestados(null);

        Livro[] livroAluno2 = {livro1,livro2,livroVazio};
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Isaac Newton");
        aluno2.setLivrosEmprestados(livroAluno2);

        alunoList.add(aluno1);
        alunoList.add(aluno2);

        for(Aluno aluno: alunoList){
            Aluno alunoSaved = alunoRepository.save(aluno);
            System.out.println(alunoSaved.getIdAluno());
        }

    }
}
