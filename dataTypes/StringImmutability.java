package dataTypes;

public class StringImmutability {
    public static void main(String[] args) {

        System.out.println("A string is a sequece of character. Is a array of characer\n" +
                "\tString is a class that can be is instantiated.\n" +
                "\tString is not e primitive type.\n" +
                "\tStrings objects are immutable\n" +
                "\tThe reference of a string is mutable\n" +
                "\tString literals are stored in the String Pool.\n");


        String name = "Claudia da Silva"; // syntatic sugar
        String linguage = new String ("Java"); // instanciated class string

        String s1 = "Rafael"; // the string Rafael is immutable
        String s2 = s1; // both reference refer to the same object

        System.out.println(s2);
        System.out.println(s1);

        String s3 = " de Luca";
        s1.concat(s3);
        System.out.println(s1);
        s1 = s1.concat(s3);

        System.out.println("\nOfter the changes");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("String Pool\n" +
                "\tTo have a efficient use of the memory the Java uses a String Pool.\n" +
                "\tString Pool is a special area of memory to storage strings,\n" +
                "\tWhen the compiler encounters a String literal, it checks the pool to see if an identical\n" +
                "\tString already exists. If exists, the reference is directed to the existing string in the string pool.\n" +
                "\tand no new String literal object is created.\n" +
                "\tThe String class is final, string class can not be extend. Because is a String literals are immutable\n");

    }
}
