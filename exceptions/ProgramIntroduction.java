package exceptions;

public class ProgramIntroduction {

    public static void main(String[] args) {

        System.out.println("Exceptions\n" +
                "\tElegan mechanismo to organise error-handling code.\n" +
                "\tErrors are detected easily without the need to write special code to test return values.\n" +
                "\tException-handling code is cleanly separated from exception-generating code.\n" +
                "\tThe same exception-handling code can be used to deal with several possible exceptions.\n" +
                "\tAn exception indicates that something UNEXPECTED happened.\n" +
                "\tA method, that deal with the exception has two appoaches.\n" +
                "\t1. Handle the exception itself.\n" +
                "\t2. Hand the responsability to the caller method.\n");

        System.out.println("Types of Exceptions.\n" +
                "\t1.Throwable.\n" +
                "\t2.Error: unexpected condition such as running out of memory. Unchecked exceptions.\n" +
                "\t3.RuntimeException: unexpected situations that are not necessarily fatal. Unchecked exceptions.\n" +
                "\t4.Exception: situations that can be anticipated. Checked exceptions.\n");

        System.out.println("Check exceptions that could be thrown within a method are wrapped in a try-catch block or thrown from the method.\n" +
                "\tRuntimeExceptions, that are unchecked exception do not obey the rule above.\n" +
                "Runtimes Exceptions.\n" +
                "\tArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException, IllegaArgumentException,\n" +
                "\tNullPointerException (trying to call a method that the reference is null, NumberFormatException\n" +
                "");

    }
}
