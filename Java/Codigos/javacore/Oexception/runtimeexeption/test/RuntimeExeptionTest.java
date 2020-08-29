package br.com.javacore.Oexception.runtimeexeption.test;

public class RuntimeExeptionTest {
    public static void main(String[] args) {
        try {
            divisao(10, 0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        /*

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


        */
    }

    private static void divisao(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de 0 para o num2! ");
        }
        int result = num1/num2;
        System.out.println(result);
    }


}
