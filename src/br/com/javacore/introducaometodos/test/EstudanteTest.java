package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.setNome(" Felipe ");
        aluno1.setIdade(21);
        aluno1.setNotas(new double[]{1,9,8});

        double media = aluno1.media();
        aluno1.aprovado(media);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());
        
    }
}
