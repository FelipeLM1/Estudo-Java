package br.com.javacore.Oexception.checkedexception.test;

import br.com.javacore.Oexception.checkedexception.classes.Funcionario;
import br.com.javacore.Oexception.checkedexception.classes.Pessoa;

public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        p.salvar();
    }
}
