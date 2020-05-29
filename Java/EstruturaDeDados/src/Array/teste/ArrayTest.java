package Array.teste;

import Array.Array;

public class ArrayTest {
    public static void main(String[] args) {

        Array array = new Array(10);

        array.adiciona("elemento 1");
        array.adiciona("elemento 2");
        array.adiciona("elemento 3");

        System.out.println(array.getTamanho());
        System.out.println(array.toString());
        System.out.println(array.busca("elemento 3"));
    }

}
