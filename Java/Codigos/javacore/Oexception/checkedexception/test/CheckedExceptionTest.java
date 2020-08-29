package br.com.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
            abrirArquivo();
    }

    //IOException
    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }
    public static void abrirArquivo() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Executando leitura");
            throw new Exception();
            //System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("Dentro do Catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechar o arquivo");
        }

    }
}

