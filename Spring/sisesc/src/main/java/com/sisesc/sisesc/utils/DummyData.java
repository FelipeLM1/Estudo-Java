package com.sisesc.sisesc.utils;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Livro;
import com.sisesc.sisesc.repository.AlunoRepository;
import com.sisesc.sisesc.repository.LivroRepository;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToStdout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    LivroRepository livroRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @PostConstruct
    public void saveData() {

        List<Livro> livroList = new ArrayList<>();
        Livro livro1 = new Livro();
        livro1.setTitulo("Fisica 1: Mecanica Geral");
        livro1.setAutor("Halliday");
        livro1.setCategoria("FISICA");


        Livro livro2 = new Livro();
        livro2.setTitulo("Fisica 2: Ondas e Termodinamica");
        livro2.setAutor("Halliday");
        livro2.setCategoria("FISICA");


        Livro livro3 = new Livro();
        livro3.setTitulo("Fisica 3: Eletromagnetismo");
        livro3.setAutor("Halliday");
        livro3.setCategoria("FISICA");

        livroList.add(livro1);
        livroList.add(livro2);
        livroList.add(livro3);


        for(Livro livro: livroList){
            Livro livroSaved = livroRepository.save(livro);
            System.out.println(livroSaved.getIdLivro());
        }

        List<Aluno> alunoList = new ArrayList<>();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Isaac Newton");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Bill Gates");

        alunoList.add(aluno1);
        alunoList.add(aluno2);


        for(Aluno aluno: alunoList){
            Aluno alunoSaved = alunoRepository.save(aluno);
            System.out.println(alunoSaved.getIdAluno());
        }
    }
}
