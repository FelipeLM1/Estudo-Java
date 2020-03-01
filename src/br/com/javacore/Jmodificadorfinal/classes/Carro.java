package br.com.javacore.Jmodificadorfinal.classes;

public class Carro {
    private static final double VELOCIDADE_FINAL = 250;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    public Comprador getComprador() {
        return comprador;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "comprador=" + comprador +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
