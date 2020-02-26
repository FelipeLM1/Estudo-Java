package br.com.javacore.Gassociacao.classes;

import org.w3c.dom.ls.LSOutput;

public class Aluno {
    private String nomeAluno;
    private int idade;
    private Seminario seminario;

    public Aluno(String nomeAluno, int idade) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;

    }

    public Aluno() {

    }

    public void print() {
        System.out.println("=========== RELATORIO DO ALUNO ==============");
        System.out.println("NOME DO ALUNO: " + this.nomeAluno);
        System.out.println("IDADE DO ALUNO: " + this.idade);
        if(this.seminario != null) {
            System.out.println("SEMINARIO DO ALUNO: " + this.seminario.getTitulo());
        }else{
            System.out.println("ALUNO NAO INSCRITO EM NENHUM SEMINARIO!");
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
