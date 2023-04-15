package dataTypes;

public class OperatorsUnary {

    public static void main(String[] args) {

        double double1 = 2.4 + 2.6;
        System.out.println("Operator\n" +
                "The + is the OPERATOR\n" +
                "The 2.4 and 2.6 are the OPERANDS\n");

        System.out.println("Java operators, as a role, are not overloaded.\n" +
                "\tThe exceptions are the +, &, |\n" +
                "\t+ can be use to concatenated strings and && and || are used as a boolean and integral operands.\n");

        System.out.println("Order of Precedence\n" +
                "\tExpressios are evaluated left to right by default\n" +
                "\tThis natural precedence can by change by using parentheses\n" +
                "*, / and % has precedence than +, -\n" +
                "= (assignment) has the lowest precedence\n");

        int result = 7 + 10 * 2;
        int result2 = (7 + 10) * 2;
        System.out.println(result); //27
        System.out.println(result2); //34

        System.out.println("Prefix and Postfix Operands\n" +
                "\t++ increment a variable by one\n" +
                "\t-- decrement a variable by one");
        int x=15, y=20;
        System.out.println(x++); // here will print before increment 16
        System.out.println(x); //15
        System.out.println(--y); // here will decrement before printing 19
        System.out.println(y); // 19

        System.out.println("\nUnary Operator" +
                "\tUnary operators has just ONE operand");

        int int1 = +15;
        double double2 = -3.1415;

        int int2 = (int) 4.66;
        System.out.println(int2); // 4

        boolean verdadeiro = true;

        System.out.println(!verdadeiro); // does not change the value of the variable  // false
        System.out.println(verdadeiro); // true

    }
}
