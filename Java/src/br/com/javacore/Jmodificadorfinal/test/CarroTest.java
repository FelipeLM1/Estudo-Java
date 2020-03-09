package br.com.javacore.Jmodificadorfinal.test;

import br.com.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Goku");
        System.out.println(c.getComprador());
    }
}
