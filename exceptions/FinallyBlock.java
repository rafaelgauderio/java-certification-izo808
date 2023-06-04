package exceptions;

public class FinallyBlock {

    public static void main(String[] args) {
        System.out.println("The finally block is designed to tidying up (arrumar) the resources, independently  an exception occurs or not.\n" +
                "If present, the finally block will be after the last catch block.\n" +
                "It the are no catch blocks the finally will be after the try block.\n" +
                "The finally block is ALWAYS executed, even though no exception has occured.\n");

        try {
            //int number = 17;
            int number = -5;
            System.out.println("Protected block code - first.");
            if (number < 0) {
                throw new RuntimeException();
            }
            System.out.println("Protected block code - second "); // if the exception occurred this line will NOT be executed
        } catch (Exception error) {
            System.out.println("Catch the exception");
        } finally {
            System.out.println("Finally block always executed!"); // if the exception occurred this line will  be executed
        }
        System.out.println("Contininuing executing the code after handle the exception");
    }
}
