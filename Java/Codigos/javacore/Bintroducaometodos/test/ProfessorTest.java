package br.com.javacore.Bintroducaometodos.test;

import br.com.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.cpf="192.292.393-09";
        prof1.matricula = "123412";
        prof1.nome = "Girafales";

        Professor prof2 = new Professor();
        prof2.cpf="222.222.323-22";
        prof2.matricula = "22222";
        prof2.nome = "Joao";

        prof1.imprime();
        System.out.println(" - - - - - - - -");
        prof2.imprime();
    }
}
