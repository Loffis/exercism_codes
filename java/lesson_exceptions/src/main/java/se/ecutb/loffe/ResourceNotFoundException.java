package se.ecutb.loffe;

/**
 * Made by Loffe!
 *
 */

public class ResourceNotFoundException extends RuntimeException {



    public ResourceNotFoundException(String message){
        super(message);

    }

    public ResourceNotFoundException() {
        super();
    }
}
