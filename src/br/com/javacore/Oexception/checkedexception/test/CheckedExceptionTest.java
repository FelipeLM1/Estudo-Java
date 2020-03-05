package br.com.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
}

