package br.com.javacore.introducaometodos.test;

import br.com.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subDoisNumeros();
        calc.multDoisNumeros(5,9);
    }
}
