package br.com.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    /*
    1 - Alocado espaco na memoria para o objeto que sera criado
    2 - Cada atributo de classe eh criado e inicializado com seus valores default ou valores explicitos
    3 - Bloco de inicializacao eh executado
    4 - O construtor eh executado
     */
    private int[] parcelas;

    // Bloco de inicializacao
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao!");
        for(int i = 1 ; i<=100 ; i++){
            parcelas[i-1] = i;
        }

    }
    public Cliente(){

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
