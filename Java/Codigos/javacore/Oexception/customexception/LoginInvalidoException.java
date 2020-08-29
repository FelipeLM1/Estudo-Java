package br.com.javacore.Oexception.customexception;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(){
        super("Usuario ou senha inválidos");
    }
}
