package br.com.javacore.Ycolecoes.test;

import br.com.javacore.Ycolecoes.classes.Produto;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Set
        // Nao permite elementos duplicados , nao tem uma ordem definida por padrao, nao tem indice
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        Set<Produto> produtoSet = new HashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        for (Produto p : produtoSet){
            System.out.println(p);
        }
    }
}
