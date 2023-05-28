package exceptions;

public class ProgramRuntimeExceptions {

    static  public String exception; // initializade as null by default

    public static void main(String[] args) {

        int size = exception.length();
        System.out.println(size); // Null Pointer Exception

    }
}
