package br.com.javacore.Fmodificadorestatico.classes;

public class Cliente {
    /*
    0 - Bloco de inicializacao estatico eh executado quando a JVM carregar a classe (eh executado apenas 1 vez)
    1 - Alocado espaco na memoria para o objeto que sera criado
    2 - Cada atributo de classe eh criado e inicializado com seus valores default ou valores explicitos
    3 - Bloco de inicializacao eh executado
    4 - O construtor eh executado
     */
    private static int[] parcelas;

    // Bloco de inicializacao
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao!");
        for(int i = 1 ; i<=100 ; i++){
            parcelas[i-1] = i;
        }

    }
    public Cliente(){

    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
