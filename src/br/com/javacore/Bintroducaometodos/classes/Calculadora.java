package br.com.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subDoisNumeros(){
        System.out.println(5-5);
    }
    public void multDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divDoisNumeros(double num1, double num2){
        if(num2!=0) {
            return num1 / num2;
        }
        return 0;
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma+=num;
        }
        System.out.println("soma array: " + soma);
    }
    public void somaVarAgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma+=num;
        }
        System.out.println("soma varArgs: " + soma);
    }
}
