package br.com.javacore.Qwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        long longPrimitivo = 10L;
        int intPrimitivo = 10;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'a';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Long longWrapper = 10L;
        Integer intWrapper = 10;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'a';
        Boolean booleanWrapper = true;

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('L'));

        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);
    }
}
