package br.com.javacore.introducaoclasses.test;

import br.com.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Fusca";
        carro1.velociadeMaxima = 120f;
        carro1.placa = "QWERTY23";
        System.out.println(carro1.modelo);
        System.out.println(carro1.velociadeMaxima);
        System.out.println(carro1.placa);
    }
}
