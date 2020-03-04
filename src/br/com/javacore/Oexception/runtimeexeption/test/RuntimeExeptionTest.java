package br.com.javacore.Oexception.runtimeexeption.test;

public class RuntimeExeptionTest {
    public static void main(String[] args) {

        //ArithmeticException
        int a = 10/0;
        System.out.println(a);

        //ArrayIndexOutOfBoundsException
        int b[] = new int[2];
        System.out.println(b[20]);

        //NullPointerException
        Object o = null;
        System.out.println(o.toString());

    }
}
