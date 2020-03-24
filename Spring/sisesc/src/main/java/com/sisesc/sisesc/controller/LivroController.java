package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Livro;
import com.sisesc.sisesc.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class LivroController {

    @Autowired
    LivroService livroService;

    @RequestMapping(value = "/livros", method = RequestMethod.GET)
    public ModelAndView getLivros() {
        ModelAndView mv = new ModelAndView("livros");
        List<Livro> livros = livroService.findAll();
        mv.addObject("livros", livros);
        return mv;
    }

    @RequestMapping(value = "/newlivro", method = RequestMethod.GET)
    public String getLivroForm() {
        return "livroAdd";
    }

    @RequestMapping(value = "/newlivro", method = RequestMethod.POST)
    public String addLivro(@Valid Livro livro, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/newlivro";
        }
        livroService.save(livro);
        return "redirect:/livros";
    }

    @RequestMapping(value = "/deletelivro/{id}", method = RequestMethod.GET)
    public String deleteLivro(@PathVariable("id") Long id){

        livroService.deleteById(id);

        return "redirect:/livros";
    }

}


