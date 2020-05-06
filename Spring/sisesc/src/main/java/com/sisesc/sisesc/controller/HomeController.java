package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void getInfoAluno(@AuthenticationPrincipal Aluno aluno) {

        System.out.println("TESTE : : : : :  :: : " + aluno.getNome());
        

    }
}
