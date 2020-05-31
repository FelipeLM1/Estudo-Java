package Array;

public class Array {

    private String[] elementos;
    private int tamanho;

    public Array(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IndexOutOfBoundsException("Posição fora do array!");
        }
        this.tamanho++;
        String aux;
        String aux2="null";
        for(int i=this.tamanho; i >posicao; i--){
            this.elementos[i+1] = this.elementos[i]
        }


        return false;
    }

    public String busca(int posicao){
        if (!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
            return this.elementos[posicao];
    }
    public int busca(String elemento){
        for(int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }


    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}

