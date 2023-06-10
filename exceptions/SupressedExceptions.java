package exceptions;

import java.io.IOException;

class MyClosableException implements AutoCloseable {
    private final int number;

    public MyClosableException(int number) {
        this.number = number;
    }

    @Override
    public void close() throws Exception {
        throw new IOException("Closing: " + number);
    }
}

public class SupressedExceptions {

    public static void main(String[] args) {
        System.out.println("Try with resources have a implicit FINALLY BLOCK. It is make in the background.");
        System.out.println("Tha stack of exception will ne call in the inverse order that they was declared.");

        try (MyClosableException one = new MyClosableException(1);
             MyClosableException two = new MyClosableException(2);
             MyClosableException three = new MyClosableException(3)) {
            throw new IOException("try"); // se comentar essa linha a MyClosable número 3 vai ser a excecao principal
        } catch (Exception error) {
            System.out.println(error.getMessage());
            for(Throwable throwable: error.getSuppressed()) {
                System.out.println("suppressed exception: " + throwable);
            }
            // bloco try aninhado
            try {
                throw new IOException("Catch nested block");
            } catch (Exception error2) {
                System.out.println(error2.getMessage());
                for (Throwable throwable: error2.getSuppressed()) {
                    System.out.println("Suppresses will be call twice??:" + throwable);
                }
            }
        } finally {
            System.out.println("Personalized Finally Block");
        }
    }
}
