package com.sisesc.sisesc.controller;

import com.sisesc.sisesc.model.Aluno;
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
import java.security.Principal;
import java.util.List;

@Controller
public class LivroController {

    @Autowired
    LivroService livroService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

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

    @RequestMapping(value = "/editlivro/{id}", method = RequestMethod.GET)
    public String showEditForm(@PathVariable("id") Long id) {
        return "update-livro";
    }

    @RequestMapping(value = "/editlivro/{id}", method = RequestMethod.POST)
    public String updateLivro(@PathVariable("id") Long id, @Valid Livro livro, BindingResult result, RedirectAttributes attributes) {


        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/editlivro/{id}";
        }
        livro.setIdLivro(id);
        livroService.save(livro);
        return "redirect:/livros";
    }

    @RequestMapping(value = "/deletelivro/{id}", method = RequestMethod.GET)
    public String deleteLivro(@PathVariable("id") Long id) {

        livroService.deleteById(id);

        return "redirect:/livros";
    }

    @RequestMapping(value = "/emprestarlivro/{id}", method = RequestMethod.GET)
    public ModelAndView ConfirmEmprestimo(@PathVariable("id") Long id) {
        Livro livro = livroService.findById(id);
        ModelAndView mv = new ModelAndView("detalhe-livro");
        mv.addObject("livro", livro);
        return mv;
    }

    @RequestMapping(value = "/emprestarlivro/{id}/", method = RequestMethod.POST)
    public String emprestarLivro(@PathVariable("id") Long id) {
        livroService.getOne(id);
        System.out.println(livroService.getOne(id));
        Long quantidade = livroService.getOne(id).getQuantidadeDisponivel();
        livroService.getOne(id).setQuantidadeDisponivel(quantidade - 1);
//        System.out.println(aluno.getNome());
//        System.out.println(livro.getTitulo());
//        if (livro.getQuantidadeDisponivel() > 0) {
//            aluno.setLivrosEmprestados(new Long[]{id, id, id});
//            livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
//
//        }
        livroService.save(livroService.getOne(id));
        return "redirect:/livros";
    }
}
