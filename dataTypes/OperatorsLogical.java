package dataTypes;

public class OperatorsLogical {

    public static void main(String[] args) {

        System.out.println("Logical AND == &&\n" +
                "\tshort-circuits: evaluates the left side of the expression first.\n" +
                "\tIf resolves to FALSE, the right side is not evaluated.\n" +
                "\tTo be true, all the terms of the expression has to be true.");

        boolean b1 = false, b2 = true;
        boolean result1 = b1 && (b2);
        System.out.println(result1); //false because the first element in the left side is false
        System.out.println("-------------------------------------------");

        System.out.println("Logical OR == ||\n" +
                "\tshort-circuits: evaluates the left side of the expression first.\n" +
                "\tIf resolves to TRUE, the right side is not evaluated.\n" +
                "\tTo be true, only one the term of the expression has to be true.");

        boolean b3 = false, b4 = true;
        boolean result2 = b3 || (b4);
        System.out.println(result2); //true because the first element in the left side is true
        System.out.println("-------------------------------------------");

        System.out.println("Logical XOR == ^\n" +
                "\tdoes not short-circuits:\n" +
                "\tone or the other but not both" +
                "\tTo be true, only one can be true. Not both. Both false equals false. Both true equals false");
        boolean xor1 = (10 > 7) ^ (50 == 50); // false. because both are true;
        boolean xor2 = (10 < 7) ^ (50 != 50); // false. because both are false;
        boolean xor3 = (10 < 7) ^ (50 == 50); // true. because only one is true;
        boolean xor4 = (10 > 7) ^ (50 != 50); // true. because only one is true;
        System.out.println(xor1 + " " + xor2 + " " + xor3 + " " + xor4); //false false true true
        System.out.println("-------------------------------------------");

        System.out.println("Bitwise AND, &\n" +
                "\tDoes not short-circuit. analise term by term. bit by bit\n" +
                "\tOperations bitwise independent of the term on the left ins true or false.\n" +
                "\tAll the expression will be analise bit by bit");
        boolean b5 = false, b6 = true;
        boolean result3 = b5 & (b6 = false);
        System.out.println(b5 + " " + b6 + " " + result3); //false false false
        System.out.println("-------------------------------------------");

        System.out.println("Bitwise OR, |\n" +
                "\tDoes not short-circuit. analise term by term. bit by bit");
        boolean b7 = false, b8 = true;
        boolean result4 = (b7 = true) | (b8);
        System.out.println(b7 + " " + b8 + " " + result4); //true true true
        System.out.println("-------------------------------------------");
    }
}
