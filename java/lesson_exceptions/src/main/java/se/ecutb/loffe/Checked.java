package se.ecutb.loffe;

public class Checked {

    public static void main(String[] args) {
        print("hej");
    }

    public static void print(String s){
        try {
            System.out.println(s);
            doStuff();
            System.out.println(s); // skrivs ej ut
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doStuff() throws Exception {
        throw new Exception();
    }

}
