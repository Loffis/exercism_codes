package se.ecutb.loffe;

public class TestClass {

    private final static TestClass INSTANCE;

    static {
        INSTANCE = new TestClass();
    }

    public static TestClass getInstance(){
        return INSTANCE;
    }

    private TestClass() {


    }
}
