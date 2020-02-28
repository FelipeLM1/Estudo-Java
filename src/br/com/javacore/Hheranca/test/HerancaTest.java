package br.com.javacore.Hheranca.test;

import br.com.javacore.Hheranca.classes.Endereco;
import br.com.javacore.Hheranca.classes.Funcionario;
import br.com.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Felipe");
        Endereco end = new Endereco();

        p.setCpf("123.123.23-23");
        end.setBairro("Bairro 1");
        end.setRua("Rua 45");
        p.setEndereco(end);

        p.imprime();

        Funcionario f = new Funcionario("Wiliam ",1500);
        f.setCpf(" 213.312.32-23");
        f.setEndereco(end);
        f.imprime();

    }
}
