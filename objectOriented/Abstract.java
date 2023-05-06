package objectOriented;

public class Abstract {

    public static void main(String[] args) {

        System.out.println("Abstract methods\n" +
                "\tAbstract methods has no implementation;\n" +
                "\tUse a abstract method when you want to oblige subclasses to provide implementation;\n" +
                "\tIf we use one or more abstract methods the class MUST be abstract;\n" +
                "\tNever use the keyword FINAL or PRIVATE with abstract methos;\n" +
                "\tabstract means please override and final methods can not be override;\n" +
                "\tprivate method can not be inherited. just public and protected.\n");

        System.out.println("Abstract class\n" +
                "\tAn abstract class can not be instantiated.\n" +
                "\tAn abstract class´s purpose is to e extended.\n" +
                "\tAll class that extended an abstract class must provide implementations for all the abstract methods.\n" +
                "\tThe first concrete subclass of an abstract class must implement all abstract methods of the superclass.\n" +
                "");

    }

}
