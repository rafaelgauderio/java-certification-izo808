package exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        System.out.println("Closing resources in the finally block can get lengthy as the closing of these resources\n" +
                "\tneed to be surround in try-catch blocks.\n" +
                "Try with resources resolve this problem.\n" +
                "Resources opened in the try clause are automatically closed by java in a IMPLICIT finally block.\n" +
                "We can code our own explicit finally block but the implicit one will be called first.\n" +
                "Because that is a implicit finally block, the catch block in no longer mandatory.\n" +
                "Must separated the resources in the try clause with semi-colon.\n" +
                "The resources create in try clause are local scope.\n" +
                "Resources are closed in reverse order to the order they are created.\n" +
                "Because of the local scope, var can be used.\n");

        System.out.println("No catch or finally required.\n" +
                "The main method must declare the throw exception on his signature.\n" +
                "");

        try(FileInputStream input = new FileInputStream("entrada.txt");
            FileOutputStream output = new FileOutputStream("saida.txt")) {
            System.out.println("we can hava a code here");
        }

        try(FileInputStream input = new FileInputStream("entrada.txt");
            var saida = new FileOutputStream("saida.txt")) {
            System.out.println("Another code here");
        }
    }
}
