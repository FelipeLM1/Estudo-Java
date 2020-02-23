public class Operadores {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 20;
        //operadores aritmeticos
        System.out.println("A soma e: " + (numero1+numero2));
        System.out.println("A sub e: " + (numero1-numero2));
        System.out.println("A mult e: " + (numero1*numero2));
        System.out.println("A div e: " + (numero2/numero1));
        int impar = 21;
        System.out.println("O numero 21 tem resto : " + (impar%2) + " por isso e impar.");
        //Operadores de comparacao
        System.out.println("1 menor q 2: " + (1<2));
        System.out.println("1 maior q 2: " + (1>2));
        System.out.println("1 e igual a 2: " + (1==2));
        System.out.println("1 e diferente de 2: " + (1!=2));
        System.out.println("1 e maior igual a 1: " + (1>=1));
        System.out.println("1 e menor igual a 1: " + (1<=1));
        //Operadores logicos
        int idade= 18;
        float salario = 1000f;
        System.out.println(idade>=18 && salario>=3000);
        System.out.println(idade>=18 || salario>=3000);
        //Operadores de atribuicao
        // = , +=, -=, *= , /=, %=
        salario += salario;
        System.out.println("salario+= "+ salario);
        salario -= 1000;
        System.out.println("salario-= " + salario);
        salario *= 0.1 ;
        System.out.println("salario*= 0.1: " + salario);
        salario /= 10 ;
        System.out.println("salario/= 10: " + salario);
        salario %= 2;
        System.out.println("salario %= 3: " + salario);
    }
}
