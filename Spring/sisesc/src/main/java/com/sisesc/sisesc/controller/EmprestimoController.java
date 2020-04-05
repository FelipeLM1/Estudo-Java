package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Livro;
import com.sisesc.sisesc.service.AlunoService;
import com.sisesc.sisesc.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class EmprestimoController {

    @Autowired
    AlunoService alunoService;

    @Autowired
    LivroService livroService;

    @RequestMapping(value = "/emprestarlivro/{id}", method = RequestMethod.GET)
    public ModelAndView getEmprestimo(@PathVariable("id") Long id) {
        Livro livro = livroService.findById(id);
        ModelAndView mv = new ModelAndView("detalhe-livro");
        mv.addObject("livro", livro);
        return mv;
    }

    @RequestMapping(value = "/emprestarlivro/{id}/confirmar", method = RequestMethod.GET)
    public String emprestarLivro(@PathVariable("id") Long id, Livro livro, Aluno aluno, Authentication authentication) {

        aluno = (Aluno) authentication.getPrincipal();
        Long[] livrosdoAluno = aluno.getLivrosEmprestados();
        System.out.println(aluno.toString());
        livro = livroService.getOne(id);
        Long quantidadeDisponivel = livro.getQuantidadeDisponivel();
        boolean temIgual = Arrays.asList(livrosdoAluno).contains(livro.getIdLivro());
        boolean temEspaco = (livrosdoAluno[0] == 0L);

        if (!temIgual && temEspaco) {
            if (quantidadeDisponivel > 0) {
                livro.setQuantidadeDisponivel(quantidadeDisponivel - 1);
                livrosdoAluno[0] = livro.getIdLivro();
                Arrays.sort(livrosdoAluno);
                livroService.save(livro);
                alunoService.save(aluno);
            } else {
                System.out.println("Nao tem livro disponivel!");
            }
        } else {
            System.out.println("O aluno nao tem espaco disponivel ou ja tem o livro!");
        }

        return "redirect:/livros";
    }

    @RequestMapping(value = "/devolverlivro/{id}/confirmar", method = RequestMethod.GET)
    public String devolverLivro(@PathVariable("id") Long id, Livro livro, Aluno aluno, Authentication authentication) {

        livro = livroService.getOne(id);
        aluno = (Aluno) authentication.getPrincipal();

        Long quantidade = livro.getQuantidadeDisponivel();
        livro.setQuantidadeDisponivel(quantidade + 1);
        livroService.save(livro);
        return "redirect:/livros";
    }
}
