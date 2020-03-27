package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value = "/newaluno", method = RequestMethod.GET)
    public String getAlunoForm() {

        return "alunoAdd";
    }

}
