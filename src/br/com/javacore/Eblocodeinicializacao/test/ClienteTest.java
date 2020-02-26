package br.com.javacore.Eblocodeinicializacao.test;

import br.com.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo parcelas: ");
        for(int aux: c.getParcelas()){
            System.out.print(aux + " ");
        }
    }
}
