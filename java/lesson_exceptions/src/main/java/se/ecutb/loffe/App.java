package se.ecutb.loffe;

/*
checked - occurs at compile time
unchecked - ignored at the time of compilation. Occurs during runtime.
errors -
 */

import java.io.IOException;

public class App
{
    public static void main( String[] args ) {
        try{
            throw new RuntimeException("Threw a runtime exception for kicks!");
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Hello World!");

        try{
            int number = parseFromString("9");
            System.out.println(number);
        }catch (NumberFormatException ex){
            System.out.println(ex);
        }



    }

    public static int parseFromString(String source) throws NumberFormatException {
        int number = Integer.parseInt(source);
        return number;
    }

}
