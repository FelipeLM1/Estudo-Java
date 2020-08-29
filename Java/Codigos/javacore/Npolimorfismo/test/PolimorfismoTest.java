package br.com.javacore.Npolimorfismo.test;

import br.com.javacore.Npolimorfismo.classes.Gerente;
import br.com.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Jose", 5000, 2000);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        relatorioPagamento.relatorioPagamentoGenerico(g);
        System.out.println("============================");
        relatorioPagamento.relatorioPagamentoGenerico(v);

    }
}
