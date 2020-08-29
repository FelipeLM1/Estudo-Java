package br.com.javacore.Minterfaces.test;

import br.com.javacore.Minterfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calculaImposto();
        produto.CalculaFrete();
        System.out.println(produto);
    }
}
