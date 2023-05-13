package objectOriented.interfaces;

interface StaticInterface {

    public static int method1 ( ) {
        return 17;
    }

    static void method2 () {
        System.out.println("Testing static method2.\n");
    }

    static double method3 () {
        return 3.14;
    }

    //static void method4(); // Static methods in interfaces should have a body
}

class  TestStaticInterface implements StaticInterface {

    public void instanceMethod () {
        System.out.println("Testing an instanced method!");
    };

    public static void main(String[] args) {

        System.out.println("Static methods are related to a class.");

        int number = StaticInterface.method1();
        double phi = StaticInterface.method3();
        StaticInterface.method2(); // void

        System.out.println(number);
        System.out.println(phi);

        TestStaticInterface tsi = new TestStaticInterface();
        tsi.instanceMethod();
    }
}
