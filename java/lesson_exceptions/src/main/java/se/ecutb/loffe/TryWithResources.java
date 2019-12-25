package se.ecutb.loffe;

import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        System.out.println(getInputFromUser());
    }

    public static String getInputFromUser(){
        String input = "";
        try(Scanner scanner = new Scanner(System.in)){
            input = scanner.nextLine();
        }catch (Exception ex){
            System.out.println(ex);
        }finally {
            System.out.println("In finally");
        }
        return input;
    }

}
