package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Turma;
import com.sisesc.sisesc.service.AlunoService;
import com.sisesc.sisesc.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlunoService alunoService;

    @Autowired
    TurmaService turmaService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getInfoAluno(@AuthenticationPrincipal Aluno aluno) {

        System.out.println(aluno.toString());
        ModelAndView mv = new ModelAndView("home");
        List<Turma> turmas = new ArrayList<>();
        int numeroDeTumas = 5;
        for (int i=0 ; i<numeroDeTumas; i++){
            Long id = aluno.getIdTurmas()[i];
            if(id != 0) {
                turmas.add(turmaService.findById(id));
            }
        }
        Collections.sort(turmas);
        mv.addObject("turmas", turmas);
        return mv;

    }
}
