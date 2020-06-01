package Array.teste;

import Array.Array;

public class ArrayTest {
    public static void main(String[] args) {

        Array<String> array = new Array(3);

        array.adiciona("1");
        array.adiciona("2");
        System.out.println(array);
        array.remove(0);
        System.out.println(array);

    }

}
