package br.com.javacore.sobrecargametodos.test;

import br.com.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Goku" , "123-456-789.59" , 4500, "159459-9");
        Funcionario funcionario2 = new Funcionario();
        funcionario1.imprime();
    }
}
