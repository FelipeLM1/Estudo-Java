package br.com.javacore.Ycolecoes.test;

import br.com.javacore.Ycolecoes.classes.Celular;
import br.com.javacore.Ycolecoes.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0,0);
        Produto produto2 = new Produto("321", "Picanha", 26.4,10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,5);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5,0);

        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        for (Produto produto : produtoNavigableSet){
            System.out.println(produto);
        }
        System.out.println("=====================");
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.lower(produto1));
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());
    }
}
