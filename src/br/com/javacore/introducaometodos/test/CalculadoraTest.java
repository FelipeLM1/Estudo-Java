package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.classes.Calculadora;

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
