package Array.teste;

import Array.Array;

public class ArrayTest {
    public static void main(String[] args) {

        Array array = new Array(3);

        array.adiciona("elemento 1");
        array.adiciona("elemento 2");
        array.adiciona("elemento 3");

        array.adiciona("elemento 4");
        array.adiciona("elemento 5");

        System.out.println(array);

        array.remove(0);
        System.out.println(array);

        array.remove("elemento 2");
        System.out.println(array);
    }

}
