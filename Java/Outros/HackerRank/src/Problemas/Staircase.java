package Problemas;

public class Staircase {

    static void staircase(int n) {

        for(int i=0 ; i<n ;i++){
            for(int j = 0; j <= n-i-2; j++){
                System.out.print(" ");
            }
            for(int j = n-i-1 ; j< n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
