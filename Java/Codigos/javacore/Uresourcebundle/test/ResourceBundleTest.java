package br.com.javacore.Uresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bom.dia"));
        rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bom.dia"));
        System.out.println(rb.getString("show"));
    }
}
