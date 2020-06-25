package Problemas;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        int soma = 0;
        for (int i = 0; i < ar.length; i++) {
            soma += ar[i];
        }
        return soma;
    }


    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4};
        System.out.println(simpleArraySum(ar));
    }

}
