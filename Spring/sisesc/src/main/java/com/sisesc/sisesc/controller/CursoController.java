package com.sisesc.sisesc.controller;


import com.sisesc.sisesc.model.Aluno;
import com.sisesc.sisesc.model.Curso;
import com.sisesc.sisesc.model.Disciplina;
import com.sisesc.sisesc.service.AlunoService;
import com.sisesc.sisesc.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CursoController {

    @Autowired
    CursoService cursoService;

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value = "/cursos", method = RequestMethod.GET)
    public ModelAndView getCurso() {
        ModelAndView mv = new ModelAndView("cursos");
        List<Curso> cursos = cursoService.findAll();
        Collections.sort(cursos);
        mv.addObject("cursos", cursos);
        return mv;
    }

    @RequestMapping(value = "cursos/detalhes/{idCurso}", method = RequestMethod.GET)
    public ModelAndView detalheCurso(@PathVariable("idCurso") Long idCurso) {
        Curso curso = cursoService.findById(idCurso);
        ModelAndView mv = new ModelAndView("cursoDetalhes");
        mv.addObject("curso", curso);
        return mv;
    }

    @RequestMapping(value = "cursos/detalhes/{idCurso}/listaAlunos", method = RequestMethod.GET)
    public ModelAndView listAlunoCurso(@PathVariable("idCurso") Long id) {
        ModelAndView mv = new ModelAndView("cursoAlunosMatriculados");
        Curso curso = cursoService.findById(id);
        List<Aluno> alunos = curso.getAlunosRegistrados();
        mv.addObject("alunos", alunos);
        return mv;
    }

    @RequestMapping(value = "cursos/novoCurso", method = RequestMethod.GET)
    public String getCursoForm() {
        return "cursoAdd";
    }

    @RequestMapping(value = "cursos/novoCurso", method = RequestMethod.POST)
    public String addCurso(Curso curso, BindingResult result, RedirectAttributes attributes) {

        List<Aluno> alunosList = new ArrayList<>();
        List<Disciplina> disciplinaList = new ArrayList<>();

        curso.setAlunosRegistrados(alunosList);
        curso.setDisciplinasRegistradas(disciplinaList);
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/novoCurso";
        }
        cursoService.save(curso);
        return "redirect:/cursos";
    }

  /*  @RequestMapping(value = "/editCurso/{id}/addDisciplina", method = RequestMethod.GET)
    public String formAddDisciplina(@PathVariable("id") Long id) {
        return "cursoAddDisciplina";
    }

    @RequestMapping(value = "/editCurso/{id}/addDisciplina", method = RequestMethod.POST)
    public String cursoAddDisciplina(@PathVariable("id") Long id, @Valid Curso curso, BindingResult result, RedirectAttributes attributes) {
        curso = cursoService.findById(id);

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preenchidos! ");
            return "redirect:/editlivro/{id}";
        }

        livroService.save(livro);
        return "redirect:/livros";
    }*/

    @RequestMapping(value = "cursos/editCurso/addAluno/{id}", method = RequestMethod.GET)
    public String formAddAluno(@PathVariable("id") Long id) {
        return "cursoAddAluno";
    }

    @RequestMapping(value = "cursos/editCurso/addAluno/{id}", method = RequestMethod.POST)
    public String cursoAddAluno(@PathVariable("id") Long id, @RequestParam("loginAluno") String loginAluno) {
        // FALTA AS VALIDAÇÕES
        Curso curso = cursoService.findById(id);
        Aluno aluno = alunoService.findByLogin(loginAluno);
        curso.getAlunosRegistrados().add(aluno);
        System.out.println(curso.getAlunosRegistrados().toString());
        cursoService.save(curso);
        aluno.setCursoMatriculado(curso.getNomeCurso());
        alunoService.save(aluno);

        return "redirect:/cursos";
    }

    @RequestMapping(value = "cursos/deleteCurso/{idCurso}", method = RequestMethod.GET)
    public String deleteCurso(@PathVariable("idCurso") Long idCurso) {

        cursoService.deleteById(idCurso);
        return "redirect:/cursos";
    }
}
