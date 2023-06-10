package exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class SuperClass {
    protected void method() throws FileNotFoundException { // checked exception
        System.out.println("SuperClass::method()");
    }
}

class SubClass extends SuperClass {
    @Override
    public void method () { // ok. method is override
    //public void method () throws FileNotFoundException { //ok. the same exception signature
    //public void method () throws RuntimeException { // ok, unchecked exception
    //public void method () throws NumberFormatException { // ok, unchecked exception
    //public void method () throws EOFException // error can not throw checked exception
    //public void method () throws IOException // erro can not throw extra checked exception

        System.out.println("SubClass::method()");
    }

}

public class ExceptionSignatures {

    public static void main(String[] args) {
        System.out.println("Exception signatures when overriding.\n" +
                "Overriding a method can be done in two wai.\n" +
                "\t1. extending a class\n" +
                "\t2. implemeting an interface\n" +
                "Independent the way you choose, it can NOT ADD EXTRA CHECKED EXCEPTIONS in the overrindig method signature.\n" +
                "This happen because the compiler is concerned with the REFERENCE TYPE.\n" +
                "The compiler works off the sinature of the void method in the SupperClass (reference).\n" +
                "At runtime, dinamically attach  (polymorphism) to the subClass.\n" +
                "That is why at runtime the subClass void method will be calll.\n" +
                "");
        SuperClass sc = new SubClass();
        try {
            sc.method();
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }
    }
}
