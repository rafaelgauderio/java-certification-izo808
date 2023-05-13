package objectOriented.interfaces;

interface DefaultMethods {

    void method1(); /* just and abstract method */
    public abstract int method2 (); // abstract method does NOT have a body

    public default void method3 () { // default method must have a body
        System.out.println("This is a default method that must have a body and it is public by default");
    }

    default int method4 () {
        return 35;
    }

    // default void method5 (); // compile error, no body

    // public abstract void method6 () { // compile error, abstract methods must not have body

    //};

}

public class DefaultStaticMethosTheory implements DefaultMethods {

    // this class must implement the abstract method, but not the default
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Previously of java 8 with we add more mehtos tho an interface, existing clients were broke,\n" +
                "\tbecause as interfaces the required implementation to all the methods." +
                "\tDefaul method resolve this problema.\n" +
                "New default mehtods are automatically available in all implementing code.\n" +
                "Default methods are NOT allowed in classes, only in interfaces.\n" +
                "Default methods are public by default and must have a concrete body.\n" +
                "Implementation classes are NOT required to implement an interfaces defaul or static methods.\n" +
                "Default and static are not allowed together\n" +
                "Default must hava a body, abstract must not have a body");

        System.out.println("\nstatic inferface method\n" +
                "Interface can include static methods with concrete implementations.\n" +
                "To make easier to organise your helper methods in your libreries, we can\n" +
                "\tkeep static methods specific to an interface rather than in a separate class.\n" +
                "static interface methods are public by default.\n" +
                "static interface methods must have a concrete body.\n" +
                "To invoke a static interface method, the interface must bu included in the invocation.\n" +
                "static method are not inherited, so they can not be override\n" +
                "static methods are related to a class.\n" +
                "default methods are related to an instance of the class");
    }
}
