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

        /*
        try {
            int number = Integer.parseInt("17");
            System.out.println(number);
            double number2 = Double.parseDouble("rafael"); // NumberFormatException
            System.out.println(number2);

        } catch (NumberFormatException error) {
            error.printStackTrace();
        }
         */

        ProgramRuntimeExceptions program = new ProgramRuntimeExceptions();
        System.out.println(program.squareRoot(81));
        System.out.println(program.squareRoot(-20)); //ILLegal Argument Exception

    }

    public double squareRoot(int number) {
        if(number < 0) {
            throw new IllegalArgumentException();
        }

        return Math.sqrt(number);
    }
}
