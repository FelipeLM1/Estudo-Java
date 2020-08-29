package br.com.javacore.Lclasseabstrata.test;

import br.com.javacore.Lclasseabstrata.classes.Funcionario;
import br.com.javacore.Lclasseabstrata.classes.Gerente;
import br.com.javacore.Lclasseabstrata.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Camila" ," 112-114-52", 1500, 5000);
        Gerente gerente = new Gerente("Anna" , "111222-2", 2000);
        vendedor.calculaSalario();
        gerente.calculaSalario();
        System.out.println(vendedor);
        System.out.println(gerente);

    }
}
