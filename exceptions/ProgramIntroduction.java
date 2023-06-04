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
                "\tNullPointerException (trying to call a method that the reference is null, NumberFormatException\n");

        System.out.println("Checked Exceptions\n" +
                "IOException (reading/writing a file)\n" +
                "FileNotFoundException (trying to access a file that does not exist\n");

        System.out.println("Call Stack\n" +
                "Is the chain in order of the methods that your program executes to get to the current method.\n" +
                "The last method called is at the top of the stack and the first method is at the bottom.\n");

        System.out.println("try and catch block\n" +
                "\tWhen an exceptional event occurs, an exception is thrown.\n" +
                "\tThe code that do something about this exception is called the 'exception handlle' and it the code 'catches the thrown exception.\n" +
                "\tA catch/finally is required\n\n" +
                "We must catch ou declare checked exceptions.\n" +
                "\t1. We surround the method that can have an exception in try-catch block.\n" +
                "\t2. Or we throw the exception in the  method that call the method that can generated the exception.\n\n" +
                "Multi try and catch blocks.\n" +
                "\tAll the cauch checked expcetions must be thrown from the try block, or we will have catch block unreachable.\n" +
                "\tMultiple catch blocks are allowed and are avaluated in the order that the are code.\n" +
                "\tWe must code to tha most specific to the least specific (most general) to note genereated unreachable catch blocks.\n" +
                "\tMulti-catch blocks enable unrelated exceptions to be handled together, thereby avoiding code duplication.\n" +
                "\tWe can not have a empty try block (checked exceptions and than the catch block.\n" +
                "\tIf the catch blocks are for RuntimeExceptions only, we can have a empty try block.\n");
    }
}