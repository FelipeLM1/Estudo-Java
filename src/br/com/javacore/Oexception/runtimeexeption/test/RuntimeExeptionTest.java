package br.com.javacore.Oexception.runtimeexeption.test;

public class RuntimeExeptionTest {
    public static void main(String[] args) {

        try {
            int b[] = new int[2];
            System.out.println(b[20]);
            System.out.println("Imprimindo dpeois da excecao");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Fora do catch");


        //ArithmeticException
        //int a = 10/0;
        //System.out.println(a);

        //NullPointerException
        //Object o = null;
        //System.out.println(o.toString());
        //ArrayIndexOutOfBoundsException

    }
}
