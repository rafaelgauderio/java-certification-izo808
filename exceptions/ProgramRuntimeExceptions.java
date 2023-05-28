package exceptions;

public class ProgramRuntimeExceptions {

    public static void main(String[] args) {

        String exception; // initializade as null by default
        //int size = exception.length();
        //System.out.println(size); // Null Pointer Exception

        /*
        String [] names = {"Rafael", "Juliana"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]); //Array Index Out Of Bounds Exception
        */

        try {
            int number = Integer.parseInt("17");
            System.out.println(number);
            double number2 = Double.parseDouble("rafael"); // NumberFormatException
            System.out.println(number2);

        } catch (NumberFormatException error) {
            error.printStackTrace();
        }

    }
}
