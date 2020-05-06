package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Turma;
import com.sisesc.sisesc.service.AlunoService;
import com.sisesc.sisesc.service.DisciplinaService;
import com.sisesc.sisesc.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class TurmaController {
    @Autowired
    DisciplinaService disciplinaService;

    @Autowired
    TurmaService turmaService;

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value = "/turmas", method = RequestMethod.GET)
    public ModelAndView getTurmas() {
        ModelAndView mv = new ModelAndView("turmas");
        List<Turma> turmas = turmaService.findAll();
        Collections.sort(turmas);
        mv.addObject("turmas", turmas);
        return mv;
    }

    @RequestMapping(value = "turmas/novaTurma", method = RequestMethod.GET)
    public String getTurmaForm() {
        return "turmaAdd";
    }

    @RequestMapping(value = "turmas/novaTurma", method = RequestMethod.POST)
    public String addTurma(@Valid Turma turma, BindingResult result, RedirectAttributes attributes) {
        // FALTA VALIDACOES
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:turmas/novaTurma";
        }
        Long[] alunos = turma.getIdAlunos();
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = 0L;
        }


        turma.setIdAlunos(alunos);
        turmaService.save(turma);
        turma.setNomeDisciplina(disciplinaService.findById(turma.getIdDisciplina()).getNomeDisciplina());
        turmaService.save(turma);
        System.out.println(turma.toString());
        return "redirect:/turmas";
    }

    @RequestMapping(value = "turmas/fazermatricula/{idTurma}", method = RequestMethod.GET)
    public String fazerMatricula(@PathVariable("idTurma") Long idTurma, Authentication authentication) {
        Turma turma;
        turma = turmaService.findById(idTurma);
        Aluno aluno = (Aluno) authentication.getPrincipal();
        Long[] idTurmasAluno = aluno.getIdTurmas();
        if (idTurmasAluno[0] == 0L) {
            idTurmasAluno[0] = idTurma;
        }
        Arrays.sort(idTurmasAluno);
        aluno.setIdTurmas(idTurmasAluno);

        Long[] turmaAlunos = turma.getIdAlunos();
        if (turmaAlunos[0] == 0L) {
            turmaAlunos[0] = aluno.getIdAluno();
        }
        turma.setIdAlunos(turmaAlunos);
        alunoService.save(aluno);
        turmaService.save(turma);

        return "redirect:/turmas";
    }
}
