package br.com.javacore.Bintroducaometodos.classes;

public class Professor {
    public String nome;
    public String cpf;
    public String matricula;

    public void imprime(){
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
    }
}
