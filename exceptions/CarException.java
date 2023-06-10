package exceptions;

public class CarException extends Exception {

    // construtor sem argumentos
    public CarException () {
    }

    public CarException (Exception exception) {
        super(exception);
    }

    public CarException(String message) {
        super(message);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("CustomException\n" +
                "Used when we need an exception that the java API do no have already implement.\n" +
                "Also used in situations that we want to hide the exception from the called method, \n" +
                "\tthe developer to now want to expose too much information about the code implementation.\n" +
                "Custom exception classes extends the relevent java API exception." +
                "We can provide custom constructors.\n");

        //throw new CarException();
        //throw new CarException("The car is running!"); // string
        throw new CarException(new RuntimeException("CarException encapsulated the runtimeException. Car is stop."));
    }
}
