package basics;

public class ClassStructure {

    // class variables are static
    // variable are not static
    static int age;
    double weight;

    // static block
    static {
        // The static block will be initialized when the class is loaded for the first time
    }
    // instance block

    {
        // the instant block are executed prior to every invocation of the constructor
    }

    // Contructed method
    // 1- Has the same name of the class
    // 2 - Has no return type
    public ClassStructure () {

    }

    public static void main(String[] args) {

        System.out.println("Definition of the structure of a Java Class\n" +
                "\tConstructor and main method are no mandatory, but to que program started we must have a main method.");

        // static methods can be called withou been a initantiaded variable
        staticMethod();

        ClassStructure classStructure = new ClassStructure();
        classStructure.nonStaticMethod();
    }

    public static void staticMethod () {
        System.out.println("This is a static method.\n" +
                "\tstatic method call be call directed.\n");
    }

    public void nonStaticMethod() {
        System.out.println("This is a no static method.\n" +
                "\tThe variable must be instantiated to call a non-static method.");
    }}