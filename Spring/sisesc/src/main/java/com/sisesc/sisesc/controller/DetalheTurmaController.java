package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.service.AlunoService;
import com.sisesc.sisesc.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetalheTurmaController {

    @Autowired
    AlunoService alunoService;

    @Autowired
    TurmaService turmaService;

    @RequestMapping(value = "/detalhes-turma", method = RequestMethod.GET)

}
