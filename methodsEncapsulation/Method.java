package methodsEncapsulation;

public class Method {

    public static void main(String[] args) {
        System.out.println("Methods are a block of java statements that are given a name for reference.\n" +
                "If the methods return nothing, it must have the word void it´s signature.\n" +
                "The signature of the method consists is the name and the parameter types and their order.\n" +
                "The compiler knows which method to overload by the parameters.\n" +
                "\tand the parameters order passed");


        System.out.println("Circle area: " + String.format("%.2f",circleArea(3)));



        System.out.println(sum(5,4));
        System.out.println(sum(5.0,4.0));
        System.out.println(sum(5.0f,4.0f));

    }

    public static double circleArea (int radius) {
        return 2 * Math.PI * radius;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //sobrecarga = overloading method
    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(float a, float b) {
        double sum = a +b;
        return String.format("%.2f",sum);
    }
}
