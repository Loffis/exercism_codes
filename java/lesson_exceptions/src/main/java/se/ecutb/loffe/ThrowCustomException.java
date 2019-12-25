package se.ecutb.loffe;

public class ThrowCustomException {
    public static void main(String[] args) {

        ResourceNotFoundException theException = new ResourceNotFoundException();
        throw theException;

    }
}
