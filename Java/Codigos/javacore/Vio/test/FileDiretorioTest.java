package br.com.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio Criado " + mkdir);
        File arquivo = new File(diretorio, "arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("Arquivo Criado " + newFile);
        File arquivoNovoNome = new File(diretorio,"Arquivo_Renomeado.txt");
        boolean renamed = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Renomeado: " + renamed);
        File diretorioReanomeado = new File("folder2");
        boolean diretorioRenamed = diretorio.renameTo(diretorioReanomeado);
        System.out.println("diretorio renomeado: " + diretorioRenamed);
    }
}
