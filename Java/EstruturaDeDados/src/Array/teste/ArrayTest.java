package Array.teste;

import Array.Array;

public class ArrayTest {
    public static void main(String[] args) {

        Array array = new Array(3);

        array.adiciona("elemento 1");
        array.adiciona("elemento 2");
        array.adiciona("elemento 3");

        array.adiciona("Elemento 4");
        array.adiciona("Elemento 5");
        System.out.println(array);
    }

}
