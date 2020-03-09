package br.com.javacore.Fmodificadorestatico.test;

import br.com.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo parcelas: ");
        System.out.println("Quantidade de parcelas: " + Cliente.getParcelas().length);
    }
}
