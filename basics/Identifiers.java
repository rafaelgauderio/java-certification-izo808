package basics;

public class Identifiers {

    public static void main(String[] args) {

        System.out.println("Legal identifiers\n" +
                "\tMust start with letter, currency character or an underscore.\n" +
                "\tThere is no limite to the number of characters an identifiar can contain.\n" +
                "\tA java keyword can not be use as an identifier.\n" +
                "\tMust not start a legl identifiers with a number.\n" +
                "\tJava identifiers are case sensitive.\n" +
                "\tJava use de desinf pattern Camel Case.\n");

        System.out.println("\nExamples of legal identifiers");
        int _age;
        int $35469;
        int _____________________s;
        String aVeryLongIdentifierUsingCamelCase = "Name";

        System.out.println("\nExamples of Illegal idenfitiers");
        /*
        int :b;
        int -rafa35;
        double +age;
        int .rafael;
        int 17variable;
         */

        System.out.println("Java key words can not be use as identifiers.\n");
        System.out.println("abstract, asset, boolean, break, byte, case, catch, char, class, const,\n" +
                "continue, default, do, double, else, enum, extends, final, finally, float, for, goto,\n" +
                "if, implements, import, instanceof, int, interface, long, native, new, package, private,\n" +
                "protected, public, return, short, static, strictfp, super, switch, synchronized, this,\n" +
                "throw, throws, transien, try, void, volatile, while." +
                "And the literals: true, false, null");
    }
}
