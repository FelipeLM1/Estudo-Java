package br.com.javacore.Rstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "    Felipe";
        nome = nome.concat(" Lima");
        System.out.println(nome);

        String test = "Goku";
        String test2 = "goku";
        System.out.println(test.charAt(2));
        System.out.println(test.equalsIgnoreCase(test2));
        System.out.println(test.length());
        System.out.println(test2.replace('g','G'));
        System.out.println(test2.toLowerCase());
        System.out.println(test2.toUpperCase());
        System.out.println(test2.substring(0,2));
        System.out.println(nome.trim());

    }
}
