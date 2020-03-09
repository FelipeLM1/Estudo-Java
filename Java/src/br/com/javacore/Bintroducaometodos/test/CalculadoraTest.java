package br.com.javacore.Bintroducaometodos.test;

import br.com.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subDoisNumeros();
        calc.multDoisNumeros(5,9);
        double res = calc.divDoisNumeros(5.6,2);
        System.out.println(res);
        int[] testSoma = {1,2,3};
        calc.somaArray(testSoma);
        calc.somaVarAgs(1,2,3);
    }
}
