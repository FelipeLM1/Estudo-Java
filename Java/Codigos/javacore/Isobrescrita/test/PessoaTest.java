package br.com.javacore.Isobrescrita.test;

import br.com.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Chester");
        p.setIdade(41);
        System.out.println(p);
    }
}
