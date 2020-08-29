package br.com.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento ");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mes: " + funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Participacao nos lucros: " + g.getPnl());
        }
        if (funcionario instanceof Vendedor){
            System.out.println("Total vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }

    }

}
