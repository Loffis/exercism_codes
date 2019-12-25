package se.ecutb.loffe;

public class Errors {

    public static void main(String[] args) {
        try{
            generateStackOverflow();
        } catch (Error err){
            System.out.println(err);
        }
        System.out.println("You are not supposed to read this really!");

    }

    public static void generateStackOverflow(){
        //System.out.println("foo");
        generateStackOverflow();
    }
}
