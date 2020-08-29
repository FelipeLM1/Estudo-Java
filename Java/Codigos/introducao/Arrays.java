package br.com.introducao;

public class Arrays {
    public static void main(String[] args) {
        //Array
        //watch?v=S2d_WfyuNmI
        int[] idades = new int[3];
        idades[0] = 1;
        idades[1] = 2;
        idades[2] = 3;
        for (int i = 0; i < idades.length; i++) {
            System.out.println("idade:" + idades[i]);

        }
        //Array foreach
        //watch?v=9zfJqV9TbYQ
        int[] numeros = new int[3];
        int[] numeros2 = {10, 22, 33, 44};
        int[] numeros3 = new int[]{1, 2, 3};

        for (int aux : numeros2) {
            System.out.println("numeros: " + aux);
        }
        //Array 2 dimensoes
        //watch?v=WFAJyBgPqSI
        int[][] matriz = new int[2][2];
        matriz[0][0] = 20;
        matriz[0][1] = 30;
        matriz[1][0] = 40;
        matriz[1][1] = 50;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //foreach 2 dimensoes
        for (int[] ref : matriz) {
            for (int aux : ref) {
                System.out.print(aux + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //arrays multidimencionais
        //watch?v=Q7IVkwq7LcM
        int[][] array = new int[3][];
        array[0] = new int[1];
        array[1] = new int[]{1, 2};
        array[2] = new int[]{3, 4, 5};
        for (int[] aux1 : array) {
            for (int aux2 : aux1) {
                System.out.print(aux2 + " ");
            }
            System.out.println(" ");
            }
        }
    }


