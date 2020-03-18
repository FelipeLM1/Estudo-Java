package br.com.javacore.Texpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d apenas digitos
        // \D tudo que nao for digito
        // \s espacos em branco
        // \S caractere nao branco
        // \w alfanumerico e _
        // \W tudo que nao for alfanumerico
        String regex = "\\W";
        String texto = "aba 121sda sd231@ 3*asddf_2312aba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: " + matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }

}
