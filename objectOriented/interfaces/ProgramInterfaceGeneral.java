package objectOriented.interfaces;

public class ProgramInterfaceGeneral  implements interface1 {

    @Override
    public void method1() {
        System.out.println("Method 1");

    }

    @Override
    public void method2() {
        System.out.println("Method 2");

    }

    @Override
    public double method3() {
        return 17.12;
    }

    @Override
    public String method4() {
        return "Method 4 return a String";
    }
    public static void main(String[] args) {

        ProgramInterfaceGeneral instance = new ProgramInterfaceGeneral();
        instance.method1();
        instance.method2();
        System.out.println("Method 3 return a double: " +String.format("%.2f",instance.method3()));
        System.out.println(instance.method4());

        // can call the variables from the interface, because they are all constants and inherited by the class
        // thay implements the inteface
        System.out.println(NUMBER);
        System.out.println(NUMBER2);
        System.out.println(NUMBER3);
        System.out.println(NAME);




    }
}
