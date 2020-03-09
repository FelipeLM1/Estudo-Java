package br.com.javacore.Minterfaces.classes;

public class Produto implements Transportavel, Tributavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal com imposto =" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    @Override
    public void CalculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    @Override
    public void calculaImposto() {
       precoFinal = this.preco + ( this.preco * IMPOSTO);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
