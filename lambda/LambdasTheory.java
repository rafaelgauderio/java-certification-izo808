package lambda;

interface FunctionalInterfaceExample {
    public abstract void onlyMethod ();

}

public class LambdasTheory {

    public static void main(String[] args) {
        System.out.println("\nLambda expression is a block of code that helps in making your code more concise.\n" +
                "A lambda expression only works with functional interfaces.\n" +
                "Interfaces are implicity abstract(unless declared as default or static) and public.\n" +
                "All variable declared in an interface must be public static and final (constants).\n" +
                "A functinal interface is an interface that has only ONE abstract method.\n" +
                "A LAMBDA EXPRESSION IS AN INSTANCE OF A CLASS THAT IMPLEMENTS A FUNCTIONAL INTERFACE.\n" +
                "Lambda expression are called 'anonymous methods'.\n" +
                "");

        FunctionalInterfaceExample fi = new FunctionalInterfaceExample() {
            @Override
            public void onlyMethod() {
                System.out.println("Implementing a lambda expression.");
            }
        };

        fi.onlyMethod();

        System.out.println("\nJava 8 lambda expression");

        FunctionalInterfaceExample lambda = () -> {
            System.out.println("Lambda expression");
        };

        FunctionalInterfaceExample lambda2 = () -> System.out.println("Concise lambda expression");

        lambda.onlyMethod();
        lambda2.onlyMethod();

    }
}