package br.com.javacore.Oexception.runtimeexeption.test;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw  new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        // java 7
        try{
            throw  new ArrayIndexOutOfBoundsException();
        }catch (IllegalArgumentException | IndexOutOfBoundsException |ArithmeticException e){
            System.out.println("dentro do catch");
        }
        System.out.println("FIM PROGRAMA!");

        try{
            talvezLanceException();
        }catch (Exception e){

        }
    }
    private static void talvezLanceException()throws SQLException, AWTException, IOException {

    }

}
