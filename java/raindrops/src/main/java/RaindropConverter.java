class RaindropConverter {

    String convert(int number) {
        String s = "";
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0){
        return s + number;
        }
        if(number % 3 == 0){
            s = "Pling";
        }
        if(number % 5 == 0){
            s = s + "Plang";
        }
        if(number % 7 == 0) {
            s = s + "Plong";
        }
        return s;
    }
}

class Rain {

    public static void main(String[] args) {
        RaindropConverter raindropConverter = new RaindropConverter();
        System.out.println(raindropConverter.convert(3530));

    }
}