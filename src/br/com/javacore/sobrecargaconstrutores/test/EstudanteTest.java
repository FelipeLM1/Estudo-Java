package br.com.javacore.sobrecargaconstrutores.test;

import br.com.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("132123","Joana", new double[]{5,8.5,9}, "25/02/2020");
        Estudante estudante2 = new Estudante("132123","Joao", new double[]{5,8.5,9});
        Estudante estudante3 = new Estudante();
        estudante1.imprime();
        estudante2.imprime();
        estudante3.imprime();
    }
}
