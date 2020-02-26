package br.com.javacore.Gassociacao.test;

import br.com.javacore.Gassociacao.classes.Aluno;
import br.com.javacore.Gassociacao.classes.Local;
import br.com.javacore.Gassociacao.classes.Professor;
import br.com.javacore.Gassociacao.classes.Seminario;


public class AssociacaoTest {
    public static void main(String[] args) {

        Seminario seminario1 = new Seminario("APLICACOES DE JAVA WEB" );
        Seminario seminario2 = new Seminario("INTRODUCAO A KOTLIN");

        Aluno aluno = new Aluno("Felipe", 21);
        Aluno aluno1 = new Aluno("Beatriz" , 22);
        Aluno aluno2 = new Aluno("Peter" , 35);
        Aluno aluno3 = new Aluno("Gabriele", 28);

        aluno.setSeminario(seminario1);
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno3.setSeminario(seminario2);

        Local local1 = new Local("Rua das araras", "Arvore Seca");
        Local local2 = new Local("Rua dos passaros", "Arvore Verde");


        Professor professor1 = new Professor("Flavio","Programacao");

        professor1.setSeminarios(new Seminario[] {seminario1,seminario2});

        seminario1.setAlunos(new Aluno[]{aluno, aluno1});
        seminario1.setLocal(local1);
        seminario1.setProfessor(professor1);

        seminario2.setProfessor(professor1);
        seminario2.setLocal(local2);
        seminario2.setAlunos(new Aluno[] {aluno2,aluno3});

        aluno.print();
        aluno1.print();
        aluno2.print();
        aluno3.print();
        professor1.print();

        seminario1.print();
        seminario2.print();

    }
}
