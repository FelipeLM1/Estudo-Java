package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Curso;
import com.sisesc.sisesc.model.Disciplina;
import com.sisesc.sisesc.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @RequestMapping(value = "/disciplinas", method = RequestMethod.GET)
    public ModelAndView getDisciplina() {
        ModelAndView mv = new ModelAndView("disciplinas");
        List<Disciplina> disciplinas= disciplinaService.findAll();
        Collections.sort(disciplinas);
        mv.addObject("disciplinas",disciplinas);
        return mv;
    }
    @RequestMapping(value = "disciplinas/novaDisciplina", method = RequestMethod.GET)
    public String getCursoForm() {
        return "disciplinaAdd";
    }

    @RequestMapping(value = "disciplinas/novaDisciplina", method = RequestMethod.POST)
    public String addDisciplina(@Valid Disciplina disciplina, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/novoCurso";
        }
        disciplina.setCursoDisciplina(" ");
        disciplinaService.save(disciplina);
        return "redirect:/disciplinas";
    }

}
