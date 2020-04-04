package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value = "/alunos", method = RequestMethod.GET)
    public ModelAndView getAlunos() {
        ModelAndView mv = new ModelAndView("alunos");
        List<Aluno> alunos = alunoService.findAll();
        mv.addObject("alunos", alunos);
        return mv;
    }

    @RequestMapping(value = "/newaluno", method = RequestMethod.GET)
    public String getAlunoForm() {
        return "alunoAdd";
    }

    @RequestMapping(value = "/newaluno", method = RequestMethod.POST)
    public String addAluno(@Valid Aluno aluno, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/newaluno";
        }
        aluno.setSenha(new BCryptPasswordEncoder().encode(aluno.getSenha()));
        aluno.setLivrosEmprestados(new Long[]{0L, 0L, 0L});
        alunoService.save(aluno);
        return "redirect:/alunos";
    }

    @RequestMapping(value = "/deletealuno/{id}", method = RequestMethod.GET)
    public String deleteAluno(@PathVariable("id") Long id) {

        alunoService.deleteById(id);
        return "redirect:/alunos";
    }
}
