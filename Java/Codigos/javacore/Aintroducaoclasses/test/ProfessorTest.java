package br.com.javacore.Aintroducaoclasses.test;

import br.com.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor girafales = new Professor();
        girafales.nome = "Girafales";
        girafales.cpf = "1111.11-11";
        girafales.matricula = "123";
        System.out.println("O professor " + girafales.nome + " de cpf: " + girafales.cpf + " possui a matricula: " +
                girafales.matricula);

    }
}
