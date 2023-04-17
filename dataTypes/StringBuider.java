package dataTypes;

public class StringBuider {

    public static void main(String[] args) {
        System.out.println("StringBuilder objects are MUTABLE\n" +
                "String objects are IMMUTABLE\n" +
                "String references are MUTABLE\n" +
                "String builder you use the same reference, so you used memory more efficient.\n" +
                "StringBuilder do not leave behing abandoned objects.\n" +
                "Use StringBuilder when you have a large ever-changing streams of data.");

        System.out.println("Prefer StringBuilder to StringBuffer\n" +
                "StringBuilder are not thread safe, methods NOT synchronized.\n" +
                "StringBuffer are thread safe, mehods are synchronized\n" +
                "StringBuffer are safer. StringBuilder are faster.\n");

        String name = "Rafael";
        name.concat(" de Luca");
        System.out.println(name); // "Rafael"

        name = name.concat(" de luca");
        System.out.println(name); // the fisrt literal string are lost;

        System.out.println("\nStringBuilder does the same without wasting memory and lose objects");
        StringBuilder sbName = new StringBuilder("Rafael");
        sbName.append(" de Luca");
        System.out.println(sbName);

        sbName.append(" da Silva").insert(23, " de Souza");
        System.out.println(sbName);



    }
}
