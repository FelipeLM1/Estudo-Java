package br.com.javacore.Ycolecoes.test;

import br.com.javacore.Ycolecoes.classes.Consumidor;
import br.com.javacore.Ycolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Felipe", "1234");
        Consumidor consumidor2 = new Consumidor("Lima", "3214");

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);

        Map<Consumidor, List<Produto>> map = new HashMap();
        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);
        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);

        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }

    }
}
