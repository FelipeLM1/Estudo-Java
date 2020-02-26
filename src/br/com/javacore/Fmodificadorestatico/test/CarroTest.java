package br.com.javacore.Fmodificadorestatico.test;

import br.com.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW" , 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes" , 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("*******************");
        Carro.setVelocidadeLimite(220);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
