package com.sisesc.sisesc.controller;


import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Curso;
import com.sisesc.sisesc.model.Disciplina;
import com.sisesc.sisesc.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CursoController {

    @Autowired
    CursoService cursoService;

    @RequestMapping(value = "/cursos", method = RequestMethod.GET)
    public ModelAndView getCurso() {
        ModelAndView mv = new ModelAndView("cursos");
        List<Curso> cursos = cursoService.findAll();
        Collections.sort(cursos);
        mv.addObject("cursos", cursos);
        return mv;
    }

    @RequestMapping(value = "/novoCurso", method = RequestMethod.GET)
    public String getCursoForm() {
        return "cursoAdd";
    }

    @RequestMapping(value = "/novoCurso", method = RequestMethod.POST)
    public String addCurso(@Valid Curso curso, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/novoCurso";
        }
        List<Aluno> alunosList = new ArrayList<>();
        List<Disciplina> disciplinaList = new ArrayList<>();
        curso.setAlunosRegistrados(alunosList);
        curso.setDisciplinasRegistradas(disciplinaList);

        cursoService.save(curso);
        return "redirect:/cursos";
    }

    @RequestMapping(value = "/deleteCurso/{idCurso}", method = RequestMethod.GET)
    public String deleteCurso(@PathVariable("idCurso") Long idCurso) {

        cursoService.deleteById(idCurso);
        return "redirect:/cursos";
    }
}
