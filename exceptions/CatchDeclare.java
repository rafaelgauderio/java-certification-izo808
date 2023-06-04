package exceptions;

import java.io.IOException;

public class CatchDeclare {


    public static void main(String[] args) throws IOException {
        // we have to cath or declare the exception on the main method (add exception method signature)
        try {
            methodWithException();

        } catch (IOException error) {
            System.out.println("An excepiton has occurred!");
            error.printStackTrace();
        }
    }

    public static void methodWithException () throws IOException {
        throw new IOException();
    }
}
