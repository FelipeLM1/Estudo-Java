package br.com.javacore.Rstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder(16);
        ab.append("def").insert(3,"ghi").reverse().delete(2,4);
        System.out.println(ab);
    }
}
