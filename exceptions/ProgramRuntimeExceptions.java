package exceptions;

public class ProgramRuntimeExceptions {

    static  public String exception; // initializade as null by default

    public static void main(String[] args) {

        //int size = exception.length();
        //System.out.println(size); // Null Pointer Exception

        String [] names = {"Rafael", "Juliana"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]); //Array Index Out Of Bounds Exception

    }
}
