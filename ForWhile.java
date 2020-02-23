public class ForWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }
        contador = 11;
        do{
            System.out.println("Do While");
        }while(contador < 10);
        for(int i = 0; i<10; i++){
            System.out.println("For: " +  i);
        }

    }
}
