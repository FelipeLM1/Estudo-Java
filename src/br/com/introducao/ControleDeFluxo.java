package br.com.introducao;

public class ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 20;
        float salario = 1000f;
        String categoria1 = "";
        String categoria2 = "";
        if (idade < 15) {
            categoria1 = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria1 = "juvenil";
        } else {
            categoria1 = "adulto";
        }
        System.out.println(categoria1);
        //operador ternario
        categoria2 = idade < 18 ? "menor de idade" : "maior de idade ";
        System.out.println(categoria2);
    }
}
