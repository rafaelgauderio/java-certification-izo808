package dataTypes;

public class OperatorCompoundAssignment {

    public static void main(String[] args) {

        System.out.println("+=, -=, *= /=\n" +
                "x+=y   equals x = x + y" +
                "x-=y   equals x = x - y" +
                "x*=y   equals x = x * y" +
                "x/=y   equals x = x/y");

        System.out.println("There is a in-bluid implicit cast\n" +
                "The experession on the right side is always placed in the parentheses");

        int i =1;

        i += (i=4) * (i + 3);
        // i = (4) * (4 + 3 ) + 1;
        // i = 28 + 1 = 29
        System.out.println(i); //29

    }
}
