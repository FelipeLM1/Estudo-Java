package com.sisesc.sisesc.controller;


import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Curso;
import com.sisesc.sisesc.model.Disciplina;
import com.sisesc.sisesc.model.Turma;
import com.sisesc.sisesc.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Controller
public class TurmaController {

    @Autowired
    TurmaService turmaService;

    @RequestMapping(value = "/turmas", method = RequestMethod.GET)
    public ModelAndView getTurmas(){
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
        for (Long aluno: alunos) {
            aluno = 0L;
        }

        turmaService.save(turma);
        return "redirect:/turmas";
    }

}
