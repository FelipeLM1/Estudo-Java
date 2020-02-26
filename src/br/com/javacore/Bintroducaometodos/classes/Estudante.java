package br.com.javacore.Bintroducaometodos.classes;

public class Estudante {
    private String nome;
    private double[] notas = new double[3];
    private int idade;

    public double media() {
        double somaNotas = 0;
        somaNotas += this.notas[0] + this.notas[1] + this.notas[2];
        return somaNotas / 3;
    }

    public void aprovado(double media) {
        String resposta = media >= 6 ? " Aprovado" : " Reprovado";
        System.out.println("O estudante: " + this.nome + " teve media: " + media + resposta);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
}
